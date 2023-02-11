package dev.projectplus.integrations.mojangfetcher.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.projectplus.integrations.mojangfetcher.struct.FetchResult;
import dev.projectplus.integrations.mojangfetcher.struct.UserCacheService;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class AshconUserCacheService extends UserCacheService {

    public AshconUserCacheService(boolean doGetTextures) {
        super("Ashcon","https://api.ashcon.app/mojang/v2/user/");
    }

    @Override
    public CompletableFuture<JsonObject> openApiConnection(String identifier) {
        return CompletableFuture.supplyAsync(() -> {
            try (InputStream url = new URL(getUrlProviderString() + identifier).openStream()) {
                InputStreamReader npr = new InputStreamReader(url);
                return JsonParser.parseReader(npr).getAsJsonObject();
            } catch (Throwable throwable) {
                return null;
            }
        });
    }

    public CompletableFuture<FetchResult> handle(String identifier, boolean printMessages) {
        return openApiConnection(identifier).handleAsync((jsonObject, throwable) -> {
            if (throwable != null && jsonObject == null) {
                return new FetchResult(null, FetchResult.FetchInfo.CONNECTION_FAILED);
            }

            if (jsonObject.has("error")) {
                int errorCode = jsonObject.get("code").getAsInt();

                if (errorCode == 404) return new FetchResult(null, FetchResult.FetchInfo.UNKNOWN_USER);

                if (errorCode == 429) return new FetchResult(null,FetchResult.FetchInfo.CONNECTION_RATE_LIMITED);

                if (errorCode == 400) return new FetchResult(null, FetchResult.FetchInfo.UNKNOWN_USER);
            }

            if (!jsonObject.has("uuid") || !jsonObject.has("username")) {
                return new FetchResult(null, FetchResult.FetchInfo.UNKNOWN_JSON_RESPONSE);
            }

            return new FetchResult(jsonObject, FetchResult.FetchInfo.CONNECTION_ESTABLISHED);
        });
    }
}

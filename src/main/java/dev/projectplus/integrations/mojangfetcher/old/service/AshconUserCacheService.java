package dev.projectplus.integrations.mojangfetcher.old.service;

import dev.projectplus.integrations.mojangfetcher.old.struct.FetchResult;
import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class AshconUserCacheService extends UserCacheService {

    public AshconUserCacheService(boolean doGetTextures) {
        super("https://api.ashcon.app/mojang/v2/user/");
    }

    @Override
    public CompletableFuture<FetchResult> openApiConnection() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                URL url = new URL(getUrlProviderString() + "ofirtim");
                InputStream inputStream = url.openStream();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return null;
        });
    }
}

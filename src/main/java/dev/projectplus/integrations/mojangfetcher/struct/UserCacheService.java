package dev.projectplus.integrations.mojangfetcher.struct;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
public abstract class UserCacheService {

    @Getter
    private final String serviceName;

    @Getter
    private final String urlProviderString;

    @Getter
    private boolean allowedEstablishedConnection;

    public abstract CompletableFuture<JsonObject> openApiConnection(String identifier);

    public abstract CompletableFuture<FetchResult> handle(String identifier, boolean printMessages);

}

package dev.projectplus.integrations.mojangfetcher.old.struct;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
public abstract class UserCacheService {

    @Getter
    private final String urlProviderString;

    @Getter
    private boolean allowedEstablishedConnection;

    public abstract CompletableFuture<FetchResult> openApiConnection();
}

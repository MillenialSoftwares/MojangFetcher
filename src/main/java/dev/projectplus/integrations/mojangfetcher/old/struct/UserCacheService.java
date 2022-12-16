package dev.projectplus.integrations.mojangfetcher.old.struct;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class UserCacheService {

    @Getter
    private final String urlProviderString;

    @Getter
    private final boolean allowEstablishedConnection;


}

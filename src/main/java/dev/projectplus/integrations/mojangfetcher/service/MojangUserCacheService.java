package dev.projectplus.integrations.mojangfetcher.service;

import dev.projectplus.integrations.mojangfetcher.struct.UserCacheService;

public abstract class MojangUserCacheService extends UserCacheService {
    public MojangUserCacheService(String urlProviderString, boolean allowEstablishedConnection) {
        super(urlProviderString, allowEstablishedConnection);
    }
}

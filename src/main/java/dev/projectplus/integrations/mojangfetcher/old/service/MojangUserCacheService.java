package dev.projectplus.integrations.mojangfetcher.old.service;

import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;

public abstract class MojangUserCacheService extends UserCacheService {
    public MojangUserCacheService(String urlProviderString, boolean allowEstablishedConnection) {
        super(urlProviderString, allowEstablishedConnection);
    }
}

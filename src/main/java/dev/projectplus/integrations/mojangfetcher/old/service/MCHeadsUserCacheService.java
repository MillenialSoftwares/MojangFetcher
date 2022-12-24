package dev.projectplus.integrations.mojangfetcher.old.service;

import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;

public abstract class MCHeadsUserCacheService extends UserCacheService {
    public MCHeadsUserCacheService(String urlProviderString, boolean allowEstablishedConnection) {
        super(urlProviderString, allowEstablishedConnection);
    }
}

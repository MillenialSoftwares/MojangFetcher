package dev.projectplus.integrations.mojangfetcher.service;

import dev.projectplus.integrations.mojangfetcher.struct.UserCacheService;

public abstract class MCHeadsUserCacheService extends UserCacheService {
    public MCHeadsUserCacheService(String urlProviderString, boolean allowEstablishedConnection) {
        super(urlProviderString, allowEstablishedConnection);
    }
}

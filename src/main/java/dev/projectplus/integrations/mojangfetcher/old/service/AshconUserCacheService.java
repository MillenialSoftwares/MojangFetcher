package dev.projectplus.integrations.mojangfetcher.old.service;

import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;

public class AshconUserCacheService extends UserCacheService {

    public AshconUserCacheService(String urlProviderString, boolean allowEstablishedConnection) {
        super(urlProviderString, allowEstablishedConnection);
    }
}

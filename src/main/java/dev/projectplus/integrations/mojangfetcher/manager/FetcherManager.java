package dev.projectplus.integrations.mojangfetcher.manager;

import dev.projectplus.integrations.mojangfetcher.struct.UserCacheService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FetcherManager {


    @Getter(AccessLevel.PACKAGE)
    private UserCacheService executorService;

}

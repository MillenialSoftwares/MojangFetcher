package dev.projectplus.integrations.mojangfetcher.old.manager;

import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.Plugin;

@RequiredArgsConstructor
public class FetcherManager {

    @Getter(AccessLevel.PRIVATE)
    private final Plugin plugin;

    @Getter(AccessLevel.PACKAGE)
    private UserCacheService executorService;

    public
}

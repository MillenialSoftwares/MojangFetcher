package dev.projectplus.integrations.mojangfetcher.old;

import dev.projectplus.integrations.mojangfetcher.old.service.AshconUserCacheService;
import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.Plugin;

public class MojangFetcher {

    private MojangFetcher() {}

    @Setter(AccessLevel.PROTECTED)
    @Getter
    private Plugin plugin;

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private static MojangFetcher instance;

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private static UserCacheService userCacheService;

    public static void init(Plugin plugin) {
        setInstance(new MojangFetcher());
        getInstance().setPlugin(plugin);
        setUserCacheService(new AshconUserCacheService(getTextures));
    }
}
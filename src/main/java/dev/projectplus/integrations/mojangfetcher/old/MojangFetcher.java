package dev.projectplus.integrations.mojangfetcher.old;

import dev.projectplus.integrations.mojangfetcher.old.service.AshconUserCacheService;
import dev.projectplus.integrations.mojangfetcher.old.struct.UserCacheService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MojangFetcher {

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private static MojangFetcher instance;

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private static UserCacheService userCacheService;

    public static void init() {
        setInstance(new MojangFetcher());
        setUserCacheService(new AshconUserCacheService(true));
    }
}
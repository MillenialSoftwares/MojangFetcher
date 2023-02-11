package dev.projectplus.integrations.mojangfetcher.struct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
public class Profile {

    @NotNull
    @Getter
    private UUID playerUUID;

    @NotNull
    @Getter
    private String playerName;

    @NotNull
    @Getter
    private Instant pulledOut;

    @Nullable
    @Getter
    private ProfileTextures profileTextures;

    @Override
    public String toString() {
        return "Profile{" +
                "playerUUID=" + playerUUID +
                ", playerName='" + playerName + '\'' +
                ", pulledOut=" + pulledOut +
                ", profileTextures=" + profileTextures +
                '}';
    }
}

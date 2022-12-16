package dev.projectplus.integrations.mojangfetcher.old.struct;

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

    @Override
    public String toString() {
        return "Profile{" +
                "playerUUID=" + playerUUID +
                ", playerName='" + playerName + '\'' +
                ", pulledOut=" + pulledOut +
                '}';
    }
}

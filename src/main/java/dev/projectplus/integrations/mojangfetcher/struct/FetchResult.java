package dev.projectplus.integrations.mojangfetcher.struct;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
public record FetchResult(
        @Nullable JsonObject jsonResult,
        @NotNull FetchInfo infoOutput) {

    public void printResult(@NotNull Level logLevel, FetchInfo messageResult) {
        Logger.getGlobal().log(logLevel, messageResult.getMessage());
    }

    @AllArgsConstructor
    public enum FetchInfo {
        CONNECTION_ESTABLISHED(Level.INFO,"Successfully established connection to {0} service."),
        CONNECTION_FAILED(Level.WARNING, "Could not connect to {0} service."),
        CONNECTION_RETRYING(Level.INFO, "Retrying connection to {0} service in {1}."),
        CONNECTION_SWITCHING_SERVICE(Level.INFO, "Switching over to {0} service."),
        CONNECTION_INTERRUPTED(Level.WARNING,"Connection interrupted..."),
        CONNECTION_RATE_LIMITED(Level.WARNING, "You have been rate limited!"),
        RATE_LIMIT_SWITCH_CACHED(Level.INFO, "switching over cached data for the next 10 minutes."),
        UNKNOWN_USER(Level.WARNING, "User unknown, please try looking for a valid user."),
        UNKNOWN_JSON_RESPONSE(Level.WARNING, "Unknown json result."),
        FETCH_RETRY(Level.INFO, "Retrying to fetch from {0}'s api."),
;
        @Getter
        private final Level levelInfo;

        @Getter
        private final String message;

        public void printResult() {
            Logger.getLogger("mojangfetcher").log(getLevelInfo(), getMessage());
        }
    }
}

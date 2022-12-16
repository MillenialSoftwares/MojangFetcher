package dev.projectplus.integrations.mojangfetcher.old.struct;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FetchResult {

    //CONNECTION RELATED
    CONNECTION_ESTABLISHED("Successfully established connection to {0}."),
    CONNECTION_FAILED_RETRY("Connection failed, retrying in {0}."),
    CONNECTION_FAILED_SWITCHING_SERVICE("Connection failed, switching over to {0} network..."),
    CONNECTION_INTERRUPTED(""),

    //RATE-LIMIT RELATED
    CONNECTION_RATE_LIMITED(""),
    
    ;
    @Getter
    private final String message;
}

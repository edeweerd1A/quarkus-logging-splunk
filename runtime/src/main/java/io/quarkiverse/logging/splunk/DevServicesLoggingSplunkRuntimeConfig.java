package io.quarkiverse.logging.splunk;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class DevServicesLoggingSplunkRuntimeConfig {
    /**
     * The API URL the splunk dev service listens on.
     */
    @ConfigItem
    public Optional<String> apiUrl;

    /**
     * Map that allows to tell to plug the following named handlers to the dev service
     * <p>
     * It is necessary as we do not have access to runtime configuration when starting the Splunk container.
     * </p>
     */
    @ConfigItem
    public Optional<String> uiUrl;
}

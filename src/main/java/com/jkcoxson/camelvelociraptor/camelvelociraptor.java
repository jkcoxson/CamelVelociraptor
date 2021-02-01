package com.jkcoxson.camelvelociraptor;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "camelvelociraptor",
        name = "camelvelociraptor",
        version = "1.0-SNAPSHOT",
        description = "Companion plugin for CamelBot",
        url = "jkcoxson.com",
        authors = {"jkcoxson"}
)
public class camelvelociraptor {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}

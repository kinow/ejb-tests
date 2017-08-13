package br.eti.kinoshita.ejb_tests.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

public class MainApplication extends ResourceConfig {

    public MainApplication() {
        super();
        packages("br.eti.kinoshita.ejb_tests.rest");
        register(LoggingFeature.class);
        register(JacksonFeature.class);
        register(RolesAllowedDynamicFeature.class);
    }
}

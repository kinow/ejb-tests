package br.eti.kinoshita.ejb_tests.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class MainApplication extends ResourceConfig {

    public MainApplication() {
        super();
        packages("br.eti.kinoshita.ejb_tests.rest");
    }
}

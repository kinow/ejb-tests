package br.eti.kinoshita.ejb_tests.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class MainServletContainer extends ServletContainer {

    private static final long serialVersionUID = -4199267059713831274L;

    public MainServletContainer() {
        super();
    }

    public MainServletContainer(ResourceConfig app) {
        super(app);
    }
}

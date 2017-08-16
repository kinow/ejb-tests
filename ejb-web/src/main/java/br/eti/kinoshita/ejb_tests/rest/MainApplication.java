package br.eti.kinoshita.ejb_tests.rest;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class MainApplication extends Application {

    public MainApplication() {
        super();
    }

    @Override
    public Set<Object> getSingletons() {
        return super.getSingletons();
    }

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}

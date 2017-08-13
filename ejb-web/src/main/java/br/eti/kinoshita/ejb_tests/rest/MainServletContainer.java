package br.eti.kinoshita.ejb_tests.rest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ext.RuntimeDelegate;

import org.glassfish.jersey.internal.RuntimeDelegateImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.WebConfig;

public class MainServletContainer extends ServletContainer {

    private static final long serialVersionUID = -4199267059713831274L;

    public MainServletContainer() {
        super();
    }

    public MainServletContainer(ResourceConfig app) {
        super(app);
    }

    @Override
    public void init(WebConfig config) throws ServletException {
        super.init(config);
        try {
            RuntimeDelegate.setInstance(new RuntimeDelegateImpl());
        } catch (Exception exc) {
            System.err.println("Exception while setting RuntimeDelegateImpl");
            exc.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.service(request, response);
    }
}

package br.eti.kinoshita.ejb_tests.rest;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("echotest")
public class TestEndpoint {

    @GET
    @Path("{messageIn}")
    @Produces("application/json")
    @PermitAll
    public String echo() {
        return "ACK!";
    }
}

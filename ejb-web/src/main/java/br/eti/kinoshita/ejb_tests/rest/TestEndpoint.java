package br.eti.kinoshita.ejb_tests.rest;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("echotest")
public class TestEndpoint {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @PermitAll
    public Response echo() {
        return Response.ok().entity("ACK!").build();
    }
}

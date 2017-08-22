package io.swagger.api;


import javax.ws.rs.*;


import io.swagger.annotations.*;
import org.openspaces.admin.rest.CustomManagerResource;
import org.openspaces.admin.rest.Response;

import java.util.List;
import javax.validation.constraints.*;

@Path("/controller")
@Api(description = "the controller API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-08-22T07:12:00.393Z")
@CustomManagerResource
public class ControllerApi  {

    @POST
    @Path("/echo")
    public Response controllerEchoPost(String echoBody) {
        return Response.ok().entity(echoBody).build();
    }

    @GET
    @Path("/testGet")
    public Response controllerTestGetGet() {
        return Response.ok().entity("magic!").build();
    }
}


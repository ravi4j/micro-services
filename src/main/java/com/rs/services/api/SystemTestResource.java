package com.rs.services.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ravisharma on 7/23/2016.
 */

@Path("/systest")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SystemTestResource {

    @GET
    public List getSystemsList(){
        List<System> systems = new ArrayList();
        int id = 1;
        while(id <= 100){
            systems.add(new System(id , "System" + id));
            id++;
        }
        return systems;
    }

    @GET
    @Path("{id}")
    public Response getSystem(@PathParam("id")Long id){
        if(id > 100){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }else {
           return Response.status(Response.Status.OK).entity(new System(id , "System" + id)).build();
        }
    }

}

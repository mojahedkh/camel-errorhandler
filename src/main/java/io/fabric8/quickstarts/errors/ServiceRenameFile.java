package io.fabric8.quickstarts.errors;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/fileservice")
public interface ServiceRenameFile {

    @POST
    @Path("/FileRename")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String rename() throws Exception;


    @GET
    @Path("/FileRename/{filename}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getmethod(@PathParam("filename") String FileName) throws Exception;
}

package CxfRestApi.service;


import CxfRestApi.model.FileMoveRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/file")
public interface FileService {

    @POST
    @Path("/fileMove")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String moveFile(String fileName) throws Exception;

}

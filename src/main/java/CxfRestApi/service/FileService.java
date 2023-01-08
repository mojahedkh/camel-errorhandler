package CxfRestApi.service;


import CxfRestApi.model.FileMoveRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/file")
public interface FileService {

    @POST
    @Path("/fileMove")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String  moveFile(FileMoveRequest request) throws Exception;
}

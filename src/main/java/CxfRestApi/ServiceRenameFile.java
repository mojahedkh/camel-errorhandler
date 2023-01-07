package CxfRestApi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/FileMove/")
public interface ServiceRenameFile {

    @POST
    @Path("/FileRename")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String rename() throws Exception;

    @POST
    @Path("/FileRename/sendFile")
    @Produces(MediaType.APPLICATION_JSON)
    public String getmethod(@QueryParam("FileName") String FileName) throws Exception;

}

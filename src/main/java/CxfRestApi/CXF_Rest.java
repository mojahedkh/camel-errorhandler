package CxfRestApi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/FileMove/")
public class CXF_Rest {
    Logger log = LoggerFactory.getLogger(CXF_Rest.class);

    public CXF_Rest() {
       log.info("CXF_Rest class is calling Now --> ");
    }

    @GET
    public void Start(){
        log.info("First Method start ");
    }

    @GET
    @Path("GetFileName/{filename}")
    public String getFileName(@PathParam("filename") String FileName) throws Exception {

        if( FileName.length()<=1){
            throw new InvalidFileNameException("hjh");
        }
        return FileName;
    }

    @GET
    @Path("GetFirstFile")
    public String getFile(){
        File file = new File();
        file.setId(12);
        file.setName("movieFile");
        return file.getName();
    }

    @POST
    @Path("InserFile")
    public Response insertFile(@PathParam("file") File file){
        return Response.ok().build();
    }

}

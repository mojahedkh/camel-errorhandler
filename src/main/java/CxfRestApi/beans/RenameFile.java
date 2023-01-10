package CxfRestApi.beans;

import CxfRestApi.Exception.InvalidFileNameException;
import CxfRestApi.constant.Constants;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RenameFile {
    Logger log = LoggerFactory.getLogger(RenameFile.class);
    public void RenameFileFromTo(Exchange exchange) throws InvalidFileNameException {

        String message =  exchange.getIn().getBody(String.class);
        String oldName = message;

        message = message +"_Moved_" + Constants.systemDate() + "_Rest";
        log.info("Rename File from { " + oldName + " } to { " + message + " }");

        Map<String,String> Responce = new HashMap<>();
        Responce.put("ResponseCode" , "200");
        Responce.put("ResponseMessage" , message);
        exchange.getIn().setBody(Responce.toString());
        exchange.getIn().setHeader("FileName" ,message );
    }

}

package CxfRestApi;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RenameFile {
    Logger log = LoggerFactory.getLogger(RenameFile.class);
    public void RenameFileFromTo(Exchange exchange) throws InvalidFileNameException{
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String sysDate = formatter.format(date);

        String message =  exchange.getIn().getBody(String.class);
        String oldName = message;

        message = message +"_Moved_" + sysDate + "_Rest";
        log.info("Rename File from {" + oldName + "} to {" + message + "}");
        exchange.getIn().setBody(message);
    }

}

package CxfRestApi;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorHandler {
    public static final Logger log = LoggerFactory.getLogger(ErrorHandler.class);
    public static final String InvlidFileNameError = "InvlidFileNameError";
    public static final String FileNotFoundError = "FileNotFoundError";

    public void checkFileIfEmpty(Exchange exchange) throws InvalidFileNameException {

        if (exchange.getIn().getBody(String.class).isEmpty()) {

            log.error("File name is empty from request body ");
            exchange.getIn().setBody("Request body is empty cant processed");
            exchange.getIn().setHeader("ErrorType", ErrorHandler.InvlidFileNameError);
            throw new InvalidFileNameException(" File name is empty");
        }
    }

    public void checkFileIfNotExsist(Exchange exchange) throws FileNotFoundException {
        String message = exchange.getIn().getBody(String.class);
        for (String name : ProcessorFiles.fileName){
            log.info("fileName content "+ name);
        }

        if (ProcessorFiles.fileName.contains(message)==false) {
            exchange.getIn().setBody("No file with this name exists");
            exchange.getIn().setHeader("ErrorType", ErrorHandler.FileNotFoundError);
            throw new FileNotFoundException("File name does not contain in the directory");
        }

    }


}

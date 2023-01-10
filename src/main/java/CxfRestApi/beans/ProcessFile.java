package CxfRestApi.beans;

import CxfRestApi.Exception.FileNotFoundException;
import CxfRestApi.Exception.InvalidFileNameException;
import CxfRestApi.constant.Constants;
import CxfRestApi.model.FileMoveRequest;
import CxfRestApi.model.FileMoveResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonDataFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

public class ProcessFile implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String message = exchange.getIn().getBody(String.class);
        message = Constants.ProcessingMessage(message);
        //set body to message from Request
        exchange.getIn().setBody(message);

        Constants.Loggers.setClassName(ProcessFile.class.getName());
        Constants.Loggers.log.info(message);

        // Create Request body
        FileMoveRequest fileRequest = new FileMoveRequest();
        fileRequest.setFileName(message);

        // Create responce body
        Map<String,String> Responce = new HashMap<>();

        if (fileRequest.getFileName().isEmpty()) {
            Constants.Loggers.log.error("File name is empty from request body");
            Responce.put("ResponceCode" , "400");
            Responce.put("ResponceMessage" , "Request body is empty cant processed");

            exchange.getIn().setBody(Responce.toString());
            exchange.getIn().setHeader("ErrorType", Constants.Messages.InvlidFileNameError);
            throw new InvalidFileNameException(" File name is empty" + Constants.Messages.FAILED);
        }

        else if (Constants.dataInsideList().contains(fileRequest.getFileName()) == false) {
            Constants.Loggers.log.error("File name does not contain in the directory ");
            Responce.put("ResponceCode" , "400");
            Responce.put("ResponceMessage" , "No file with this name exists");

            exchange.getIn().setBody(Responce.toString());
            exchange.getIn().setHeader("ErrorType", Constants.Messages.FileNotFoundError);
            throw new FileNotFoundException("File name does not contain in the directory");
        }

    }
}

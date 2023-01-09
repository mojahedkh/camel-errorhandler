package CxfRestApi.beans;

import CxfRestApi.Exception.FileNotFoundException;
import CxfRestApi.Exception.InvalidFileNameException;
import CxfRestApi.constant.Constants;
import CxfRestApi.model.FileMoveRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ProcessFile implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
            FileMoveRequest message =   exchange.getIn().getBody(FileMoveRequest.class);
            Constants.Loggers.log.info(message.getFileName()+"");

        if (message.getFileName().isEmpty()) {
            Constants.Loggers.log.error("File name is empty from request body");
            exchange.getIn().setBody("Request body is empty cant processed");
            exchange.getIn().setHeader("ErrorType", Constants.Messages.InvlidFileNameError);
            throw new InvalidFileNameException(" File name is empty" + Constants.Messages.FAILED);
        }

        else if (Constants.dataInsideList().contains(message.getFileName()) == false) {
            Constants.Loggers.log.error("File name does not contain in the directory ");
            exchange.getIn().setBody("No file with this name exists");
            exchange.getIn().setHeader("ErrorType", Constants.Messages.FileNotFoundError);
            throw new FileNotFoundException("File name does not contain in the directory");
        }
    }
}

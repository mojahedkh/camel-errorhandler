package CxfRestApi.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class AddToList implements Processor {
    public static List<String> fileName;
    Logger log = LoggerFactory.getLogger(RenameFile.class);

    public AddToList() {
        fileName = new ArrayList<>();
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        String fileNameFromHeader = exchange.getIn().getHeader("fileName", String.class);
        fileName.add(fileNameFromHeader);
        exchange.getIn().setBody(fileNameFromHeader);
    }
}

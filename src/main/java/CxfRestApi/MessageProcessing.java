package CxfRestApi;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MessageProcessing implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Object message = exchange.getIn().getBody();
        JAXBContext content ;
        content = JAXBContext.newInstance(File.class);
        Unmarshaller um = content.createUnmarshaller();

    }
}

package CxfRestApi.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

public class ProcessResponce implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Map<String,String> Responce = new HashMap<>();
        Responce.put("ResponceCode" , "200");
        Responce.put("ResponceMessage" , exchange.getIn().getBody(String.class));
        exchange.getIn().setBody(Responce.toString());
    }
}

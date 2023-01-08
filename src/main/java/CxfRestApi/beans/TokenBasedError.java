package CxfRestApi.beans;

import org.apache.camel.Exchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TokenBasedError {
    public static final Random random = new Random();
    public void generateTokenToFileName(Exchange exchange){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String sysDate = formatter.format(date);

        String errorType = exchange.getIn().getHeader("ErrorType" , String.class);
        exchange.getIn().setHeader("generateToken", errorType+sysDate+random.nextInt(1000));
    }
}

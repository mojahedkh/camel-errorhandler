package CxfRestApi.beans;

import CxfRestApi.constant.Constants;
import org.apache.camel.Exchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TokenBasedError {
    public static final Random random = new Random();

    public void generateTokenToFileName(Exchange exchange) {
        String errorType = exchange.getIn().getHeader("ErrorType", String.class);
        exchange.getIn().setHeader("generateToken", errorType + Constants.systemDate() + random.nextInt(1000));
    }
}

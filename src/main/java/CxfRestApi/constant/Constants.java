package CxfRestApi.constant;

import CxfRestApi.beans.AddToList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Constants {

    public static class Messages {

        public static final String SUCCESS = "SUCCESS";
        public static final String FAILED = "FAILED";
        public static final String InvlidFileNameError = "InvlidFileNameError";
        public static final String FileNotFoundError = "FileNotFoundError";

    }

    public static class Loggers {
        public static String className;

        public static void setClassName(String className) {
            Loggers.className = className;
        }

        public static String getClassName() {
            return className;
        }

        public static final Logger log = LoggerFactory.getLogger(getClassName());
    }

    public static String systemDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String sysDate = formatter.format(date);
        return sysDate;
    }
    public static String ProcessingMessage(String message ){
        message = message.replaceAll("[{}:\"]*","").replace("fileName","").trim();
        return message ;
    }
    public static List<String> dataInsideList() {
        return AddToList.fileName;
    }

}

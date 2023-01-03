package io.fabric8.quickstarts.errors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RenameFile {
    Logger log = LoggerFactory.getLogger(RenameFile.class);

    public String RenameFileFromTo(String FileName) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String SysDate = formatter.format(date);

        String OldName = FileName;
        FileName = FileName + "_Moved_" + SysDate + "_Rest";
        log.info("Rename File from {" + OldName + "} to {" + FileName + "}");
        return FileName;
    }

}

package org.example.logger;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerEx {

    static final Logger logger = Logger.getLogger(LoggerEx.class);  //ceazione logger e dichiarazione classe di cui monitorare le info


    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");

    }

}

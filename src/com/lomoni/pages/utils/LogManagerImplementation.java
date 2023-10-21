package com.lomoni.pages.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/*
 * Author : Braine Lomoni 168864 21/10/2023
 * Functionality :
 * - Initialize a logger object using Log4j library
 * - Provides methods to log messages at different levels of severity.
 * - Debug
 * - Info
 * - Warn
 * - Error
 * - Fatal
 * - Trace
 */
public class LogManagerImplementation {
    private Logger logger;

    public LogManagerImplementation(String className){
        try {
            if (!className.isEmpty()) {
                logger = LogManager.getLogger(className);
            } else {
                Objects.requireNonNull(className, "className must not be null");
            }
        } catch(Exception exception){
            fatalLog("className must not be null", exception);
        }
    }

    public void debugLog(String info, Exception exception){
        logger.debug(info, exception);
    }

    public void infoLog(String info, Exception exception){
        logger.info(info, exception);
    }

    public void warnLog(String info, Exception exception){
        logger.warn(info, exception);
    }

    public void errorLog(String info, Exception exception){
        logger.error(info, exception);
    }

    public void fatalLog(String info, Exception exception){
        logger.fatal(info, exception);
    }

    public void traceLog(String info, Exception exception){
        logger.trace(info, exception);
    }
}

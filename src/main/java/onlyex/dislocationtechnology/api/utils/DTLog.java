package onlyex.dislocationtechnology.api.utils;

import org.apache.logging.log4j.Logger;

public class DTLog {
    public static Logger logger;

    public DTLog() {}

    public static void init(Logger modLogger) {
        logger = modLogger;
    }
}

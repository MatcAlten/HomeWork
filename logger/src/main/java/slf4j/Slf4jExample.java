package slf4j;

import com.alten.logger.logger.HomeResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

    private static Logger logger = LoggerFactory.getLogger(HomeResource.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");

    }
}

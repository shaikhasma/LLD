package singleton;
class LoggerService{
    private static LoggerService logger = null;

    private LoggerService() {}

    synchronized public static LoggerService getLogger() {
        if (logger == null) {
            logger = new LoggerService();
        }

        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
public class Example {
    public static void main(String[] args) {
        LoggerService logger = LoggerService.getLogger();

        logger.log("Hello World!");
    }
}

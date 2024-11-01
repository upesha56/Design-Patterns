public class Logger {
    private static Logger instance; // The Single instance
    // Private constructor to prevent creating new instance
    private Logger() {}
    // This static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Logging: " + message);
    }
    public static void main(String[] args) {
        // Get the singleton instance
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("Processing user requests.");

    }
}

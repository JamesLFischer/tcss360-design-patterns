public class Logger {

    private static Logger instance;
    private int loggedCount = 0;

    // private constructor
    private Logger() {
    }

    // global access point
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public synchronized void log(String message) {
        loggedCount++;
        System.out.println("LOG: " + message + " [count=" + loggedCount + "]");
    }
}
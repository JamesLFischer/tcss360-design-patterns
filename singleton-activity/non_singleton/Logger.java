public class Logger {
    private int loggedCount = 0;

    public void log(String message) {
        loggedCount++;
        System.out.println("LOG: " + message + " [count=" + loggedCount + "]");
    }
}
public class Worker implements Runnable {
    private final String name;
    private final Logger logger;

    public Worker(String name) {
        this.name = name;
        this.logger = new Logger(); // each worker creates its own logger
    }

    @Override
    public void run() {
        logger.log("Worker " + name + " started");

        for (int i = 1; i <= 3; i++) {
            logger.log("Worker " + name + " step " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
            }
        }

        logger.log("Worker " + name + " finished");
    }
}
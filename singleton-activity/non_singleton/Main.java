public class Main {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Worker("A"));
        Thread t2 = new Thread(new Worker("B"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Done.");
    }
}
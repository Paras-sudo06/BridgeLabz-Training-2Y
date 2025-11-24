public class BackgroundJob {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background job running...");
        };

        new Thread(task).start();

        System.out.println("Main thread continues...");
    }
}

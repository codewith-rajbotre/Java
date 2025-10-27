
public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 1; i <= 10; i++) {
            int id = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Running virtual thread #" + id + " -> " + Thread.currentThread());
            });
        }

        Thread.sleep(1000);
    }
}

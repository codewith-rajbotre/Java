import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorExample{
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(2);
        exe.execute(()-> System.out.println("Task 1 by "+ Thread.currentThread().getName()));
        exe.execute(()-> System.out.println("Task 2 by "+ Thread.currentThread().getName()));
        exe.shutdown();
    }
}
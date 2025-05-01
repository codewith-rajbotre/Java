import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemo {

    // Functional Interface Example
    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    public static void main(String[] args) {

        // 1. Lambda with Runnable
        Runnable task = () -> System.out.println("Running in a thread using Lambda!");
        new Thread(task).start();

        // 2. Lambda with Comparator for sorting
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);

        // 3. Lambda with forEach (Consumer)
        names.forEach(name -> System.out.println("Hello, " + name));

        // 4. Lambda with Custom Functional Interface
        GreetingService greet = message -> System.out.println("Message: " + message);
        greet.sayMessage("Welcome to Lambda Expressions in Java 8!");

        // 5. Lambda with Predicate (used for filtering)
        Predicate<String> startsWithA = str -> str.startsWith("A");
        for (String name : names) {
            if (startsWithA.test(name)) {
                System.out.println("Name starting with A: " + name);
            }
        }
    }
}

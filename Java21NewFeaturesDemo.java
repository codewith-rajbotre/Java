import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Java21NewFeaturesDemo {

    record Person(String name, int age) {}

    static void virtualThreads() throws InterruptedException {
        Thread.startVirtualThread(() ->
                System.out.println(Thread.currentThread())
        );
        Thread.sleep(200);
    }

    static void switchPatterns(Object obj) {
        System.out.println(
                switch (obj) {
                    case Integer i -> "Integer " + i;
                    case String s -> "String " + s;
                    case null -> "Null";
                    default -> "Unknown";
                }
        );
    }

    static void recordPatterns() {
        Person p = new Person("Jara", 23);
        if (p instanceof Person(String name, int age)) {
            System.out.println(name + " " + age);
        }
    }

    static void sequencedCollections() {
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("First");
        set.add("Middle");
        set.add("Last");

        System.out.println(set.getFirst());
        System.out.println(set.getLast());
    }

    public static void main(String[] args) throws Exception {
        virtualThreads();
        switchPatterns(10);
        switchPatterns("Java");
        recordPatterns();
        sequencedCollections();
    }
}

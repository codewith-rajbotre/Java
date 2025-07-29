// File: RecordDemo.java

public class RecordDemo {

    // Declare a record (immutable data class)
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create a new Person record
        Person p = new Person("Jara", 25);

        // Access and print record fields using accessors
        System.out.println(p.name() + " is " + p.age() + " years old.");
    }
}

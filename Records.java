// File: RecordDemo.java

public class Records {
    // Defining a record to represent a person
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Creating a Person record object
        Person p = new Person("Jara", 25);

        // Accessing fields using auto-generated methods
        System.out.println(p.name() + " is " + p.age() + " years old.");

        // Printing the object directly (uses auto-generated toString())
        System.out.println("Person record: " + p);

        // Testing immutability (uncommenting next line will cause compile error)
        // p.name = "New Name"; // Error: Cannot assign a value to final variable 'name'

        // Comparison: creating another person with same values
        Person p2 = new Person("Jara", 25);
        System.out.println("Is p equal to p2? " + p.equals(p2)); // true
    }
}

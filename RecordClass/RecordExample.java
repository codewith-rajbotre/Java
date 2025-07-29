public class RecordExample {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person person = new Person("Jara", 25);
        System.out.println("Name: " + person.name() + ", Age: " + person.age());
    }
}

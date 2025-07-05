// Generic Class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// Generic Method Class
class Utility {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Bounded Type Example
class MathUtil<T extends Number> {
    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}

// Generic Interface
interface Printer<T> {
    void print(T data);
}

// Implementation of Printer Interface
class StringPrinter implements Printer<String> {
    public void print(String data) {
        System.out.println("StringPrinter Output: " + data);
    }
}

// Main Class
public class Generics {
    public static void main(String[] args) {
        // Generic Class Example
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("Box<String>: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Box<Integer>: " + intBox.get());

        // Generic Method Example
        String[] names = {"Jara", "Amit", "Sara"};
        Integer[] numbers = {10, 20, 30};

        System.out.print("Names: ");
        Utility.printArray(names);

        System.out.print("Numbers: ");
        Utility.printArray(numbers);

        // Bounded Type Example
        MathUtil<Double> doubleUtil = new MathUtil<>();
        System.out.println("Square of 7.5: " + doubleUtil.square(7.5));

        // Generic Interface Example
        Printer<String> printer = new StringPrinter();
        printer.print("This is a generic interface demo.");
    }
}

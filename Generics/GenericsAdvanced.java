import java.util.ArrayList;
import java.util.List;

// 1. Generic class with multiple bounded types
class DataProcessor<T extends Number & Comparable<T>> {
    private T[] data;

    public DataProcessor(T[] data) {
        this.data = data;
    }

    public T findMax() {
        T max = data[0];
        for (T val : data) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }
}

// 2. Generic interface
interface Converter<F, T> {
    T convert(F from);
}

class StringToIntegerConverter implements Converter<String, Integer> {
    public Integer convert(String from) {
        return Integer.parseInt(from);
    }
}

// 3. Generic method
class Utils {
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 4. Method with wildcard (? extends)
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // 5. Method with wildcard (? super)
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}

public class GenericsAdvanced {
    public static void main(String[] args) {
        // Using generic class
        Integer[] numbers = { 10, 20, 30, 5 };
        DataProcessor<Integer> processor = new DataProcessor<>(numbers);
        System.out.println("Max: " + processor.findMax());

        // Using generic method
        String[] words = { "Java", "Generics", "Advanced" };
        Utils.printArray(words);

        // Using generic interface
        Converter<String, Integer> converter = new StringToIntegerConverter();
        System.out.println("Converted: " + converter.convert("123"));

        // Using wildcards
        List<Integer> intList = new ArrayList<>();
        Utils.addIntegers(intList);
        Utils.printNumbers(intList);
    }
}

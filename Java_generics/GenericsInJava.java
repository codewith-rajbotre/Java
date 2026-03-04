
class AnyClass<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

}

public class GenericsInJava {

    //generics methods 
    public static <T> void PrintArray(T arr[]) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        //Integer generice method example
        Integer intArr[] = {11, 22, 33, 12};
        PrintArray(intArr);
        //String generice method example

        String stringArr[] = {"Hello", "New", "Generics", "Method"};
        PrintArray(stringArr);

        AnyClass<Integer> a = new AnyClass<>();
        a.set(3);
        System.out.println("Integer value in Generics : " + a.get());

        AnyClass<String> s = new AnyClass<>();

        s.set("Hello to generics");
        System.out.println("String value in Generics : " + s.get());

    }
}

class AnyClass<T>{

    T value;
    void set(T value){
        this.value = value;
    }
    T get(){
        return value;
    }

}

public class GenericsInJava{
    public static void main(String[] args) {
        AnyClass <Integer> a = new AnyClass<>();
        a.set(3);
      System.out.println("Integer value in Generics : "+a.get());

      AnyClass <String> s = new AnyClass<>();

      s.set("Hello to generics");
      System.out.println("String value in Generics : "+ s.get());

    }
}
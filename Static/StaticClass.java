class Mobile{
    String brand;
    int price;
    String name;
    public void show(){
        System.out.println(name + " "+ price + " " + brand);
    }
}



public class StaticClass{
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand ="Apple";
        obj.price =33333;
        obj.name ="Iphone16";
        obj.show();
    }
}
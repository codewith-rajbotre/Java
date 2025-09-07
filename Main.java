class Parent {
    Parent() { 
        show();  // calls overridden method
    }
    void show() { 
        System.out.println("Parent show"); 
    }
}

class Child extends Parent {
    String msg = "Hello";
    void show() { 
        System.out.println(msg);  // may print null
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();  // create Child object
    }
}

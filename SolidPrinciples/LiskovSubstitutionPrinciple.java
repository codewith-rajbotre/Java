//LiskovSubstitutionPrinciple.java

interface Shape {
    int area();
}

class ProperRectangle implements Shape {
    private int width, height;

    ProperRectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int area() {
        return width * height;
    }
}

class ProperSquare implements Shape {
    private int side;

    ProperSquare(int s) {
        this.side = s;
    }

    public int area() {
        return side * side;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Shape rect = new ProperRectangle(5, 10); // Rectangle
        Shape square = new ProperSquare(7);      // Square

        // Both can be substituted as Shape without breaking anything
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Square Area: " + square.area());
    }
}

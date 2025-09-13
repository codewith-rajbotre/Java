//OpenClosedPrinciple.java
// File: OCPDemo.java

interface Shape {
    double area();
}

// Circle implements Shape
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle implements Shape
class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Triangle implements Shape (added later without modifying AreaCalculator)
class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// AreaCalculator uses abstraction (Shape interface)
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);

        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Triangle area: " + calculator.calculateArea(triangle));
    }
}

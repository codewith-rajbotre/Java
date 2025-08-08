// Java 21 Sealed Classes with Pattern Matching for switch

sealed abstract class Shape
        permits Circle, Rectangle, Triangle {
    public abstract double area();
}

final class Circle extends Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    public double radius() { return radius; }
    @Override
    public double area() { return Math.PI * radius * radius; }
}

sealed class Rectangle extends Shape
        permits Square, GenericRectangle {
    protected final double width;
    protected final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double width() { return width; }
    public double height() { return height; }
    @Override
    public double area() { return width * height; }
}

final class Square extends Rectangle {
    public Square(double side) { super(side, side); }
}

non-sealed class GenericRectangle extends Rectangle {
    public GenericRectangle(double width, double height) { super(width, height); }
}

final class Triangle extends Shape {
    private final double base;
    private final double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double base() { return base; }
    public double height() { return height; }
    @Override
    public double area() { return 0.5 * base * height; }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new GenericRectangle(4, 6),
            new Triangle(3, 8)
        };

        for (Shape shape : shapes) {
            printShapeInfo(shape);
        }
    }

    static void printShapeInfo(Shape shape) {
        switch (shape) {
            case Circle c ->
                System.out.printf("Circle radius=%.2f, area=%.2f%n", c.radius(), c.area());
            case Square sq ->
                System.out.printf("Square side=%.2f, area=%.2f%n", sq.width(), sq.area());
            case GenericRectangle gr ->
                System.out.printf("GenericRectangle %.2fx%.2f, area=%.2f%n",
                        gr.width(), gr.height(), gr.area());
            case Triangle t ->
                System.out.printf("Triangle base=%.2f height=%.2f, area=%.2f%n",
                        t.base(), t.height(), t.area());
            // Needed for exhaustiveness (Rectangle is abstract)
            case Rectangle r -> 
                throw new IllegalStateException("Unexpected abstract Rectangle type: " + r.getClass().getName());
        }
    }
}

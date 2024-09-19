abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();

    void show(String shape) {
        System.out.println(shape + " Area: " + getArea());
        System.out.println(shape + " Perimeter: " + getPerimeter());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(5);
        rectangle.show("Rectangle");
        circle.show("Circle");
    }
}

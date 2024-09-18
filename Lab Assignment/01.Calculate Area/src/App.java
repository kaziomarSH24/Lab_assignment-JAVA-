import java.util.Scanner;

abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();
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

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Choose an option:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        } else if (choice == 2) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);
            System.out.println("Circle Area: " + circle.getArea());
            System.out.println("Circle Perimeter: " + circle.getPerimeter());

        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

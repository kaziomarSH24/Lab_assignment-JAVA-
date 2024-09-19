/*Design a nested class Point inside a class Shape to represent a point in 2D space. Use
composition to include an instance of the Point class in subclasses such as Rectangle and
Triangle.*/

class Shape {
    class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void showPoint() {
            System.out.println("(" + x + ", " + y + ")");
        }
    }
}

class Rectangle extends Shape {
    Point topLeft, bottomRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        topLeft = new Point(x1, y1);
        bottomRight = new Point(x2, y2);
    }

    public void showRectangle() {
        System.out.print("Rectangle Top-Left: ");
        topLeft.showPoint();
        System.out.print("Rectangle Bottom-Right: ");
        bottomRight.showPoint();
    }
}

class Triangle extends Shape {
    Point pointA, pointB, pointC;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        pointA = new Point(x1, y1);
        pointB = new Point(x2, y2);
        pointC = new Point(x3, y3);
    }

    public void showTriangle() {
        System.out.print("Triangle Point A: ");
        pointA.showPoint();
        System.out.print("Triangle Point B: ");
        pointB.showPoint();
        System.out.print("Triangle Point C: ");
        pointC.showPoint();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0, 4, 5);
        rect.showRectangle();
        Triangle tri = new Triangle(0, 0, 3, 4, 5, 1);
        tri.showTriangle();
    }
}

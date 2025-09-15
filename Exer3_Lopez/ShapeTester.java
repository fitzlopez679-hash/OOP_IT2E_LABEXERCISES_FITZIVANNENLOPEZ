abstract class Shape {
    protected final float PI = 3.14f;

    public Shape() {
    }

    public abstract float calculateArea();

    public abstract String displayInfo();
}

class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public float calculateArea() {
        return PI * (radius * radius);
    }

    public String displayInfo() {
        return "Circle - radius: " + this.radius + ", area: " + this.calculateArea();
    }
}

class Square extends Shape {
    private float side;

    public Square(float side) {
        super();
        this.side = side;
    }

    public float calculateArea() {
        return side * side;
    }

    public String displayInfo() {
        return "Square - side: " + this.side + ", area: " + this.calculateArea();
    }
}

class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        super();
        this.width = width;
        this.height = height;
    }

    public float calculateArea() {
        return width * height;
    }

    public String displayInfo() {
        return "Rectangle - width: " + this.width + ", height: " + this.height + ", area: " + this.calculateArea();
    }
}

class Triangle extends Shape {
    private float base;
    private float height;

    public Triangle(float base, float height) {
        super();
        this.base = base;
        this.height = height;
    }

    public float calculateArea() {
        return 0.5f * base * height;
    }

    public String displayInfo() {
        return "Triangle - base: " + this.base + ", height: " + this.height + ", area: " + this.calculateArea();
    }
}

public class ShapeTester {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.00f);
        Shape s2 = new Square(4.00f);
        Shape s3 = new Rectangle(3.00f, 6.00f);
        Shape s4 = new Triangle(8.00f, 2.50f);

        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
        System.out.println(s3.displayInfo());
        System.out.println(s4.displayInfo());
    }
}
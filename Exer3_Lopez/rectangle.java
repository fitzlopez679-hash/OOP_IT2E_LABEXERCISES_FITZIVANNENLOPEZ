public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public String displayInfo() {
        return "Rectangle - width: " + this.width + ", height: " + this.height + ", area: " + this.calculateArea();
    }
}
public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public String displayInfo() {
        return "Rectangle - width: " + this.width + ", height: " + this.height + ", area: " + this.calculateArea();
    }
}

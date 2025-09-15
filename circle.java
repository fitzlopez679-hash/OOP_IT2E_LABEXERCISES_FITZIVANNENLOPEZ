public class Circle extends Shape {
    private float radius;
    final float PI = 3.14f;
    private float area;

    public Circle(float radius){
        super();
        this.radius = radius;
    }

    public float calculateArea(){
        area = PI * (radius * radius);
        return area;
    }

    public String getRadius(){
        return "The radius of the circle is: " + this.radius + " and the area is " + this.calculateArea();
    }

    public String displayInfo(){
        return "Circle - radius: " + this.radius + ", area: " + this.calculateArea();
    public String getRadius(){
        return "The radius of the circle is: " + this.radius + " and the area is " + this.calculateArea();
    }

    public String displayInfo(){
        return "Circle - radius: " + this.radius + ", area: " + this.calculateArea();
    }
}
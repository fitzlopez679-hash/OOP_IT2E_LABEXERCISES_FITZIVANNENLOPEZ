public class ShapeTester {

    public static void main(String[] args) {
        
        Shape s1 = new Circle(5.00f);
        Shape s2 = new Square(4.00f);
        Shape s3 = new Rectangle(3.00f, 6.00f);
        Shape s4 = new Trianlge(8.00f, 2.50f);

        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
        System.out.println(s3.displayInfo());
        System.out.println(s4.displayInfo());
    }
}
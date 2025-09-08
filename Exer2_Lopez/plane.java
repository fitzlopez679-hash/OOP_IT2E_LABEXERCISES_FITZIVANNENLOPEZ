public class plane {
    private String color;
    private String TailNum;
    private String brandName;
    // Default constructor
    public plane() {
        this.color = "Unknown";
        this.TailNum = "Unknown";
        this.brandName = "Unknown";
    }

    // Parameterized constructor
    public plane(String color, String TailNum, String brandName) {
        this.color = color;
        this.TailNum = TailNum;
        this.brandName = brandName;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("TailNum: " + TailNum);
        System.out.println("Brand Name: " + brandName);
        System.out.println();
    }

}
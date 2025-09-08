public class Car {
    private String color;
    private String licensePlate;
    private String chassisNumber;
    private String brandName;
    // Default constructor
    public Car() {
        this.color = "Unknown";
        this.licensePlate = "Unknown";
        this.chassisNumber = "Unknown";
        this.brandName = "Unknown";
    }

    // Parameterized constructor
    public Car(String color, String licensePlate, String chassisNumber, String brandName) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.chassisNumber = chassisNumber;
        this.brandName = brandName;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Chassis Number: " + chassisNumber);
        System.out.println("Brand Name: " + brandName);
        System.out.println();
    }
}
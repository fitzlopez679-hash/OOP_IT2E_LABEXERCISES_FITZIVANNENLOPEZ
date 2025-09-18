public class SUV extends LandTransport {
    private boolean fourWheelDrive;

    public SUV(String name, int capacity, float maxSpeedKph, int numWheels, boolean fourWheelDrive) {
        super(name, capacity, maxSpeedKph, numWheels);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", fourWheelDrive: " + fourWheelDrive;
    }
}


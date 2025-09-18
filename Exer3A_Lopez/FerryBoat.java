public class FerryBoat extends WaterTransport {
    private int vehicleCapacity;

    public FerryBoat(String name, int capacity, float maxSpeedKph, int vehicleCapacity) {
        super(name, capacity, maxSpeedKph, "diesel");
        this.vehicleCapacity = vehicleCapacity;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", vehicleCapacity: " + vehicleCapacity;
    }
}


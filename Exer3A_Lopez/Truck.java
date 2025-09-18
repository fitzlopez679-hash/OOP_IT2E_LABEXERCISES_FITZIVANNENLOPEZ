public class Truck extends LandTransport {
    private float payloadTons;

    public Truck(String name, int capacity, float maxSpeedKph, int numWheels, float payloadTons) {
        super(name, capacity, maxSpeedKph, numWheels);
        this.payloadTons = payloadTons;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", payloadTons: " + payloadTons;
    }
}


public class Plane extends AirTransport {
    private String airline;

    public Plane(String name, int capacity, float maxSpeedKph, int engineCount, String airline) {
        super(name, capacity, maxSpeedKph, engineCount);
        this.airline = airline;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", airline: " + airline;
    }
}
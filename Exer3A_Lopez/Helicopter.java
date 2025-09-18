public class Helicopter extends AirTransport {
    private int rotorBlades;

    public Helicopter(String name, int capacity, float maxSpeedKph, int engineCount, int rotorBlades) {
        super(name, capacity, maxSpeedKph, engineCount);
        this.rotorBlades = rotorBlades;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", rotorBlades: " + rotorBlades;
    }
}


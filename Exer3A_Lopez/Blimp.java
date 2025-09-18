public class Blimp extends AirTransport {
    private String gasType;

    public Blimp(String name, int capacity, float maxSpeedKph, int engineCount, String gasType) {
        super(name, capacity, maxSpeedKph, engineCount);
        this.gasType = gasType;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", gas: " + gasType;
    }
}


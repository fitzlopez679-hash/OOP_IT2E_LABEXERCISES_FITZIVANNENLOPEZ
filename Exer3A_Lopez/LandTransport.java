public abstract class LandTransport extends Transportation {
    protected int numWheels;

    public LandTransport(String name, int capacity, float maxSpeedKph, int numWheels) {
        super(name, capacity, maxSpeedKph);
        this.numWheels = numWheels;
    }

    @Override
    public String getCategory() {
        return "Land";
    }

    @Override
    protected String getDetailsSuffix() {
        return ", wheels: " + numWheels;
    }
}


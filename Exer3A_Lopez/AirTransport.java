public abstract class AirTransport extends Transportation {
    protected int engineCount;

    public AirTransport(String name, int capacity, float maxSpeedKph, int engineCount) {
        super(name, capacity, maxSpeedKph);
        this.engineCount = engineCount;
    }

    @Override
    public String getCategory() {
        return "Air";
    }

    @Override
    protected String getDetailsSuffix() {
        return ", engines: " + engineCount;
    }
}


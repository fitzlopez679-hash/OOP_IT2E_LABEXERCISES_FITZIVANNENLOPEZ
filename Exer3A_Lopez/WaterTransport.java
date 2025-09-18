public abstract class WaterTransport extends Transportation {
    protected String propulsionType;

    public WaterTransport(String name, int capacity, float maxSpeedKph, String propulsionType) {
        super(name, capacity, maxSpeedKph);
        this.propulsionType = propulsionType;
    }

    @Override
    public String getCategory() {
        return "Water";
    }

    @Override
    protected String getDetailsSuffix() {
        return ", propulsion: " + propulsionType;
    }
}


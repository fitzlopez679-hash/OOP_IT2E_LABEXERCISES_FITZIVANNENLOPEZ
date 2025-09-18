public class AirBalloon extends AirTransport {
    private String balloonMaterial;

    public AirBalloon(String name, int capacity, float maxSpeedKph, int engineCount, String balloonMaterial) {
        super(name, capacity, maxSpeedKph, engineCount);
        this.balloonMaterial = balloonMaterial;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", material: " + balloonMaterial;
    }
}


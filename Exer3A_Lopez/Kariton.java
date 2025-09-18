public class Kariton extends LandTransport {
    private boolean animalDrawn;

    public Kariton(String name, int capacity, float maxSpeedKph, boolean animalDrawn) {
        super(name, capacity, maxSpeedKph, 2);
        this.animalDrawn = animalDrawn;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", animalDrawn: " + animalDrawn;
    }
}


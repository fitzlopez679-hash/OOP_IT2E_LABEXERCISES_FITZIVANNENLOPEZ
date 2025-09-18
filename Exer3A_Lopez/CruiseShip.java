public class CruiseShip extends WaterTransport {
    private int deckCount;

    public CruiseShip(String name, int capacity, float maxSpeedKph, int deckCount) {
        super(name, capacity, maxSpeedKph, "diesel-electric");
        this.deckCount = deckCount;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", decks: " + deckCount;
    }
}


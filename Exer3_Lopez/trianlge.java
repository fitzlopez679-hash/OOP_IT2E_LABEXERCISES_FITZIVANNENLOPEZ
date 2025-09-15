public class Trianlge extends Shape {
    private float base;
    private float height;

    public Trianlge(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return 0.5f * base * height;
    }

    @Override
    public String displayInfo() {
        return "Trianlge - base: " + this.base + ", height: " + this.height + ", area: " + this.calculateArea();
    }
}

public class Sphere extends Circle {


    public Sphere (int x, int y, int radius) {
        super(x, y, radius);
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

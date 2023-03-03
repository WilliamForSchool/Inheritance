public class Point {
    private int x;
    private int y;



    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }

    public Double distanceTo(Point other) {
        Double distance = Math.sqrt(((other.x - x) * (other.x - x)) + ((other.y - y) * (other.y - y)));
        return (double) (Math.round(distance * 100)) / 100;
    }
}

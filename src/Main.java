import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> shapes = new ArrayList<>();
        shapes.add(new Circle(2, 6, 16));
        shapes.add(new Point(14, 6));
        shapes.add(new Circle(19, 5, 7));
        shapes.add(new Point(2, 7));
        shapes.add(new Point(5, 18));
        shapes.add(new Circle(4, 19, 9));
        shapes.add(new Point(9, 1));
        shapes.add(new Circle(6, 10, 7));
        shapes.add(new Sphere(7, 1, 6));
        shapes.add(new Sphere(8, 9, 1));

        for(Point p: shapes) {
            System.out.println(p.getArea());
        }


    }
}
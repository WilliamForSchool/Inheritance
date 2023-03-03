import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(10, 13);
        System.out.println(p);
        Point p2 = new Point(34, 40);
        System.out.println(p.distanceTo(p2));
        System.out.println(p2.distanceTo(p));
        System.out.println();
        System.out.println();


        Circle circ = new Circle(10, 13, 10);
        System.out.print(circ);
        System.out.println();
        System.out.println();


        Object o1 = new Point(4, 5);
        Object o2 = new Circle(6, 7, 3);
        Object o3 = new HashMap<>();
        Point p3 = new Circle(4, 5, 9);
        System.out.println(p3);


    }
}
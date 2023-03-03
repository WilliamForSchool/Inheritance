public class Main {
    public static void main(String[] args) {
        Point p = new Point(10, 13);
        System.out.println(p);
        Point p2 = new Point(34, 40);
        System.out.println(p.distanceTo(p2));
        System.out.println(p2.distanceTo(p));


        Circle circ = new Circle(10, 13, 10);
        System.out.print(circ);


    }
}
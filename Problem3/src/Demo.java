public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point p1: " + p1);
        p1.move(1.0f, 2.0f);
        System.out.println("After moving p1: " + p1);

        MovablePoint p2 = new MovablePoint(1.0f, 1.0f, 2.0f, 3.0f);
        System.out.println("MovablePoint p2: " + p2);
        p2.move();
        System.out.println("After moving p2: " + p2);
    }
}

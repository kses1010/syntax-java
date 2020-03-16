package syntax.chapter9.page460;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println();

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

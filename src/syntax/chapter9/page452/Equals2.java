package syntax.chapter9.page452;

public class Equals2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        if (p1.equals(p2)) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }
    }
}

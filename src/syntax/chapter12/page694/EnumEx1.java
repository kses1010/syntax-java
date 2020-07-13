package syntax.chapter12.page694;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Direction.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 :" + (d1 == d2));
        System.out.println("d1 == d3 :" + (d1 == d3));

        switch (d1) {
            case EAST:
                System.out.println("East입니다.");
                break;
            case WEST:
                System.out.println("West입니다.");
        }

        Direction[] dArr = Direction.values();

        for (Direction d : dArr) {
            System.out.printf("%s = %d\n", d.name(), d.ordinal());
        }
    }
}

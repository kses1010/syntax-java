package syntax.chapter7.page318;

public class Circle extends Shape {
    private Point center;
    private int r;

    public Circle() {
        this(new Point(0, 0), 100);
    }

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    public void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s\n", center.getX(), center.getY(), r, color);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}

package syntax.chapter7.page392;

public class Unit {
    private int hitPoint;
    private final int MAX_HP;

    public Unit(int hp) {
        MAX_HP = hp;
    }

    public int getMAX_HP() {
        return MAX_HP;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void repairHP() {
        hitPoint++;
    }
}

package syntax.chapter7.page392.units;

import syntax.chapter7.page392.GroundUnit;
import syntax.chapter7.page392.Repairable;

public class Tank extends GroundUnit implements Repairable {

    public Tank() {
        super(150);
        setHitPoint(getMAX_HP());
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

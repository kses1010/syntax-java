package syntax.chapter7.page392.units;

import syntax.chapter7.page392.AirUnit;
import syntax.chapter7.page392.Repairable;

public class Dropship extends AirUnit implements Repairable {

    public Dropship() {
        super(150);
        setHitPoint(getMAX_HP());
    }

    @Override
    public String toString() {
        return "Dropship";
    }
}

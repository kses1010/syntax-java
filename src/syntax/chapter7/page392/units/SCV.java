package syntax.chapter7.page392.units;

import syntax.chapter7.page392.Repairable;
import syntax.chapter7.page392.Unit;

public class SCV extends Unit implements Repairable {

    public SCV() {
        super(60);
        setHitPoint(getMAX_HP());
    }

    public void repair(Repairable repair) {
        if (repair instanceof Unit) {
            Unit unit = (Unit) repair;
            while (unit.getHitPoint() != unit.getMAX_HP()) {
                unit.repairHP();
            }
            System.out.println(unit.toString() + "의 수리가 끝났습니다.");
        }
    }
}

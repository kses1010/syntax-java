package syntax.chapter7.page392;

import syntax.chapter7.page392.units.Dropship;
import syntax.chapter7.page392.units.Marine;
import syntax.chapter7.page392.units.SCV;
import syntax.chapter7.page392.units.Tank;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}

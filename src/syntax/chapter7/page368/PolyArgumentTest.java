package syntax.chapter7.page368;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer p1 = new Buyer(1000, 0);
        p1.buy(new Tv());
        p1.buy(new Computer());

        System.out.println("현재 남은 돈은 " + p1.getMoney() + "만원입니다.");
        System.out.println("현재 남은 돈은 " + p1.getBonusPoint() + "점입니다.");

    }
}

package syntax.chapter7.page368;

public class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer(int money, int bonusPoint) {
        this.money = money;
        this.bonusPoint = bonusPoint;
    }

    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("잔액부족");
        }
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.println(product + "을 구입하셨습니다.");
    }
}

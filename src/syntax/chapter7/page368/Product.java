package syntax.chapter7.page368;

public class Product {
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

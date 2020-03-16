package syntax.chapter9.page454;

public class Card {
    private String kind;
    private int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return kind + " " + number;
    }
}

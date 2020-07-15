package syntax.chapter13.page772;

public class Wait {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "Cook1").start();
        new Thread(new Customer(table, "donut"), "고객1").start();
        new Thread(new Customer(table, "burger"), "고객2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}

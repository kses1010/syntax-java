package syntax.chapter7.page359;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.drive();
        car1.stop();
        Car car2 = new FireEngine();
        ((FireEngine) car2).water();    //
    }
}

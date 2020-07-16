package syntax.chapter14.page799;

public class LambdaEx1 {
    static void execute(MyFunction f) {
        f.run();    // 매개변수의 타입이 MyFunction 인 메서드
    }

    static MyFunction getMyFunction() {
        MyFunction f = () -> System.out.println("f3.run()"); // 반환 타입이 MyFunction 인 메서드
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");
        MyFunction f2 = new MyFunction() { // 익명 클래스
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();
        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}

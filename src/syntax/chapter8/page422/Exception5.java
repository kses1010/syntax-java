package syntax.chapter8;

public class Exception5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException arithmetic) {
            arithmetic.printStackTrace();
            System.out.println("예외메세지: " + arithmetic.getMessage());
        }
        System.out.println(5);
    }
}

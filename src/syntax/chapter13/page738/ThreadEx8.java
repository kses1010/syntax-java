package syntax.chapter13.page738;

public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 t1 = new ThreadEx8_1();
        ThreadEx8_2 t2 = new ThreadEx8_2();

        t2.setPriority(7);

        System.out.println("Priority of t1(-) : " + t1.getPriority());
        System.out.println("Priority of t2(|) : " + t2.getPriority());

        t1.start();
        t2.start();
    }
}

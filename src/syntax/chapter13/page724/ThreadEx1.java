package syntax.chapter13.page724;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadMethod t1 = new ThreadMethod();

        Runnable r = new RunnableMethod();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

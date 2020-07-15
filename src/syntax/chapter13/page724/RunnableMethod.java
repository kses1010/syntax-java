package syntax.chapter13.page724;

public class RunnableMethod implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        } // Thread.currentThread() : 현재 실행중인 Thread를 반환한다.
    }
}

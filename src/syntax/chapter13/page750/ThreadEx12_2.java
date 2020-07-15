package syntax.chapter13.page750;

public class ThreadEx12_2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("|");
        }
    }
}

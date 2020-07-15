package syntax.chapter13.page760;

public class ThreadEx18_1 implements Runnable {
    private boolean suspended = false;
    private boolean stopped = false;

    Thread th;

    public ThreadEx18_1(String name) {
        th = new Thread(this, name);    // Thread(Runnable r, String name)
    }

    @Override
    public void run() {
        String name = th.getName();

        while (!stopped) {
            if (!suspended) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + " - interrupted");
                }
            } else {
                Thread.yield();
            }
        }
        System.out.println(name + " - stopped");
    }

    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by suspend()");
    }

    public void stop() {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by stop()");
    }

    public void resume() {
        suspended = false;
    }

    public void start() {
        th.start();
    }

}

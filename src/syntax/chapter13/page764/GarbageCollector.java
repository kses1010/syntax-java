package syntax.chapter13.page764;

public class GarbageCollector {
    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;

        for (int i = 0 ; i < 20; i++) {
            requiredMemory = (int) (Math.random() * 10) * 20;
            if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
                gc.interrupt();
                try {
                    gc.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory: " + gc.usedMemory);
        }

    }
}

class ThreadEx20_1 extends Thread {
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt()");
            }

            gc();
            System.out.println("Garbage Collected. Free Memory : " + freeMemory());
        }
    }

    public void gc() {
        usedMemory -= 300;
        if (usedMemory < 0) usedMemory = 0;
    }

    public int totalMemory() {
        return MAX_MEMORY;
    }

    public int freeMemory() {
        return MAX_MEMORY - usedMemory;
    }

}

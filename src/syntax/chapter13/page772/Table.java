package syntax.chapter13.page772;

import java.util.ArrayList;

public class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) { // 동기화를 위한 synchronized 추가
        if (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dishes.add(dish);
        notify(); // 기다리고 있는 고객을 깨우게 함.
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {   // 동기화
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + " is waiting");
                try {
                    wait(); // 고객 쓰레드를 기다린다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // COOK을 깨움.
                        return false;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait(); // 고객 쓰레드를 기다림
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}

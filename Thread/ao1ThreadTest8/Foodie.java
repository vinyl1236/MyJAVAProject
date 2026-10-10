package Thread.ao1ThreadTest8;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println("顾客在吃" + food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

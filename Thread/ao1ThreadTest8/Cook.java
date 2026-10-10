package Thread.ao1ThreadTest8;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
            try {
                while (true) {
                    queue.put("面条");
                    System.out.println("厨师在准备面条");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

package Thread.ao1ThreadTest6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();

                try {
                    if (ticket == 100) {
                        break;
                    } else {
                        ticket++;
                        System.out.println(getName() + "正在卖第" + ticket + "张票");
                    }
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
        }
    }
}



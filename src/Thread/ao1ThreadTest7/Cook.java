package Thread.ao1ThreadTest7;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.Lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlog == 1) {
                        try {
                            Desk.Lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("厨师做了一碗面条");
                        Desk.foodFlog = 1;
                        Desk.Lock.notifyAll();
                    }
                }
            }
        }
    }
}

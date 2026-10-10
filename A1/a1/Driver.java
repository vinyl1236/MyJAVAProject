package A1.a1;

import java.util.concurrent.Semaphore;

public class Driver extends Thread {

    private static Semaphore myturn;
    private static Semaphore TanPoliceturn;
    private static int line;

    public Driver(Semaphore myturn, Semaphore TanPoliceturn) {
        this.myturn = myturn;
        this.TanPoliceturn = TanPoliceturn;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myturn.acquire();
                System.out.println(getName() + (line == 0 ? "算了嘛，警官。" : "有。"));
                line = 1 - line;
                Thread.sleep(1000);
                TanPoliceturn.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

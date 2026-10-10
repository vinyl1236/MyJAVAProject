package A1.a1;

import java.util.concurrent.Semaphore;

public class TanPolice extends Thread {

    private static Semaphore myturn;
    private static Semaphore driverturn;
    private static int line;

    public TanPolice(Semaphore myturn, Semaphore driverturn) {
        this.myturn = myturn;
        this.driverturn = driverturn;
    }

    @Override
    public void run() {
        while (true) {
            try{
                myturn.acquire();
                System.out.println(getName()+ (line == 0?"你有没有驾照？":"有就请出示驾照。"));
                line=1-line;
                Thread.sleep(1000);
                driverturn.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


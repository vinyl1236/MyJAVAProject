package Thread.ao1ThreadTest5;

public class MyRunnable implements Runnable{

    private static int ticket = 0;

    @Override
    public void run() {
        while (true){
            if(method()) break;
        }
    }

    private synchronized boolean method(){
        if (ticket == 100) {
            return true;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }
    }
}

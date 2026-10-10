package Thread.ao1ThreadTest7;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.Lock) {
                if(Desk.count == 0) {
                    System.out.println("吃货吃完了所有面条");
                    break;
                }else{
                    if(Desk.foodFlog == 0) {
                        try {
                            Desk.Lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("吃货正在吃面条，还能再吃" + Desk.count + "碗");
                        Desk.count--;
                        Desk.Lock.notifyAll();
                        Desk.foodFlog = 0;
                    }
                }
            }
        }
    }
}

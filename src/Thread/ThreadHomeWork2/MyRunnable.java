package Thread.ThreadHomeWork2;

public class MyRunnable implements Runnable{

    static int gifts = 100;

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (gifts < 10) {
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + "给出第" + gifts + "个礼物");
                        gifts--;
                    }

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

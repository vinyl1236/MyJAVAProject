package Thread.ThreadHomeWork4;

import java.util.Random;

public class MyRunnable implements Runnable {

    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;
    static double price = 0;

    @Override
    public void run() {
        synchronized (MyRunnable.class){
            if(count == 0){
                System.out.println(Thread.currentThread().getName() + "没抢到！");
            }else{
                if(count == 1){
                    price = money;
                }else{
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    price = Math.round(r.nextDouble(bounds) * 100) / 100.0;
                    if(price < MIN){
                        price = MIN;
                    }
                }
                count--;
                System.out.printf("%s抢到：%.2f%n", Thread.currentThread().getName(), price);
                money -= price;
            }
        }
    }
}

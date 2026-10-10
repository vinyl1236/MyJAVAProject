package Thread.ThreadHomeWork5;

import java.util.Random;

public class MyThread extends Thread {
    private static int[] arr = {10,5,20,50,100,200,500,800,2,80,300,700};

    @Override
    public void run() {
        while(true){
            synchronized (Test.class){
                try{
                    Random random = new Random();
                    int idx =  random.nextInt(arr.length);
                    System.out.println(getName() + "又产生了一个"+arr[idx]+"元大奖！");
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

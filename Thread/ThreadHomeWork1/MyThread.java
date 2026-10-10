package Thread.ThreadHomeWork1;

public class MyThread extends Thread {

    static int ticket = 1;

    @Override
    public void run() {

        try{
            while (true){
                synchronized (MyThread.class) {
                    if (ticket>1000){
                        break;
                    }
                    Thread.sleep(3000);
                    System.out.println(getName()+"正在卖" +ticket+"张票");
                    ticket++;
                }
            }
            }catch (Exception e){
                e.printStackTrace();
        }
    }
}

package Thread.ThreadHomeWork3;

public class MyThread extends Thread {

    static int count = 1;

    @Override
    public void run() {
        try{
            while(true){
                synchronized (MyThread.class){
                    if(count==100){
                        break;
                    }
                    if(count%2==0){
                        count++;
                    }else{
                        System.out.println(getName()+" "+count);
                        count++;
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

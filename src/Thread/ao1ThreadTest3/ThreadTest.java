package Thread.ao1ThreadTest3;

public class ThreadTest extends  Thread{

    public ThreadTest(){

    }
    public ThreadTest(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName()+"在跑");
    }

}

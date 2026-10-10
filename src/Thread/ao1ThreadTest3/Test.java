package Thread.ao1ThreadTest3;

public class Test {
    public static void main(String[] args) {
        //ThreadTest threadTest1 = new ThreadTest("飞机");
        //ThreadTest threadTest2 = new ThreadTest("坦克");

        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        t1.setName("飞机");
        t2.setName("坦克");
        t1.start();
        t2.start();

    }
}

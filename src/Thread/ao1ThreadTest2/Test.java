package Thread.ao1ThreadTest2;

public class Test {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        Thread t1Thread = new Thread(t1);
        Thread t2Thread = new Thread(t2);

        t1Thread.setName("t1");
        t2Thread.setName("t2");
        t1Thread.start();
        t2Thread.start();
    }
}

package Thread.ao1ThreadTest1;

public class Test {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

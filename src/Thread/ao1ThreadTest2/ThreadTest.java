package Thread.ao1ThreadTest2;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ".HelloWorld");
        }
    }
}

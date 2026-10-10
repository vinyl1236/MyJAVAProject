package Thread.ao1ThreadTest1;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ".HelloWorld");
        }
    }
}

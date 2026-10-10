package Thread.ThreadHomeWork1;

public class Test {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("窗口1：");
        m2.setName("窗口2：");

        m1.start();
        m2.start();
    }
}

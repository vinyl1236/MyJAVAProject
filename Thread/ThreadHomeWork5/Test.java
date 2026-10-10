package Thread.ThreadHomeWork5;

public class Test {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("抽奖箱1:");
        m2.setName("抽奖箱2:");

        m1.start();
        m2.start();
    }
}

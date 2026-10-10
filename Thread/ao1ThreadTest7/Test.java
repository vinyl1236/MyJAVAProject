package Thread.ao1ThreadTest7;

public class Test {
    public static void main(String[] args) {
        Foodie foodie = new Foodie();
        Cook cook = new Cook();

        foodie.setName("吃货~");
        cook.setName("厨师~");

        foodie.start();
        cook.start();
    }
}

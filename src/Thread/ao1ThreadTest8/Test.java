package Thread.ao1ThreadTest8;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        cook.start();
        foodie.start();
    }
}

package OopTest.ooptest10;

public class Test {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.show();
    }
}

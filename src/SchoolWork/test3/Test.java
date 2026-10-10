package SchoolWork.test3;

public class Test {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a1 = i/100;
            int a2 = (i/10)%10;
            int a3 = i%10;
            if(a1*a1*a1+a2*a2*a2+a3*a3*a3==i){
                System.out.println(i);
            }
        }
    }
}

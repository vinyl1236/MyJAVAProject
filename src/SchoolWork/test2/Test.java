package SchoolWork.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入您的购物总金额~");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double t =n;
        if(t<100){
            System.out.println("您没有优惠");
        }else if(t>100&&t<200){
            System.out.println("您有10%的优惠");
            t*=0.9;
        }else if(t>200&&t<300){
            System.out.println("您有20%的优惠");
            t*=0.8;
        }else{
            System.out.println("您有30%的优惠");
            t*=0.7;
        }
        System.out.println("您的购物金额是"+n+"元，您最终需要支付的金额为："+t + "元");
    }
}

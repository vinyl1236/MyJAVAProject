package SchoolWork.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.定义变量
        double Balance;
        double TotalConsumptionAmountToday;
        double AverageDailyConsumption;

        //2.输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前余额：");
        Balance = sc.nextDouble();
        System.out.println("请输入今日消费总额：");
        TotalConsumptionAmountToday = sc.nextDouble();
        System.out.println("请输入30天平均每日消费额：");
        AverageDailyConsumption = sc.nextDouble();

        //3.计算
        int n= (int) (Balance/AverageDailyConsumption);

        //4.判断是否停卡
        boolean isStopCord= false;
        if(Balance<AverageDailyConsumption){
            isStopCord= true;
        }else{
            isStopCord= false;
        }

        //5.判断预警等级
        String color = "";
        if(n>=7){
            color="绿色提示";
        }else if(n>=3&&n<7){
            color="黄色预警";
        }else if(n<3){
            color="红色预警";
        }

        //6.输出结果
        System.out.println("还能消费"+n+"天");
        System.out.println("预警等级"+color);
        System.out.println("是否停卡"+(isStopCord?"是":"否"));

        System.out.println("----------附加内容----------");
        //7.计算需要冲的金额
        double needMoney = AverageDailyConsumption*30-Balance;
        if(needMoney>0){
            System.out.printf("冲%.2f够30天\n",needMoney);
        }else{
            System.out.println("你现在钱够够的");
        }

        //8.计算31天后的平均每日消费
        double oldTotalConsumption = AverageDailyConsumption*30;
        double newTotalConsumption = oldTotalConsumption+TotalConsumptionAmountToday;
        double newAvg=newTotalConsumption/31;
        System.out.printf("31天后的平均每日消费：%.2f\n",newAvg);
        sc.close();
    }
}

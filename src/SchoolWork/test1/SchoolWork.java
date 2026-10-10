package SchoolWork.test1;

import java.util.Scanner;
public class SchoolWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] avgArr = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("请输入第%d位学生的3门成绩(空格分隔)：%n", i + 1);
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            double avg = (s1 + s2 + s3) / 3.0;
            avgArr[i] = avg;
            System.out.printf("第%d位学生：成绩 %d,%d,%d，平均分 %.2f%n", i+1, s1, s2, s3, avg);
        }
        double maxAvg = avgArr[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if(avgArr[i] > maxAvg){
                maxAvg = avgArr[i];
                index = i;
            }
        }
        System.out.println("\n=====成绩单汇总=====");
        if(maxAvg < 60){
            System.out.println("全员不及格");
        }else{
            System.out.printf("平均分最高的是第%d位学生，平均分：%.2f%n", index+1, maxAvg);
        }
        sc.close();
    }
}

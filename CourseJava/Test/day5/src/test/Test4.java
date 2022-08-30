package test;

/*
* 任务：猜数字小游戏
* 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
* 如果三次没猜中，输出“不玩了！”
* */

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;   // 生成一个1-100之间的随机数

        int count = 0;

        while (true){

            count++;
            if (count > 3){
                System.out.println("不玩了！"); // 游戏里的抽奖保底机制
                break;
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您猜的数字：");
            int guess = sc.nextInt();

            if (guess > number){
                System.out.println("猜大了");
            }else if (guess < number){
                System.out.println("猜小了");
            }else {
                System.out.println("猜中了！");
                break;
            }
        }

    }
}

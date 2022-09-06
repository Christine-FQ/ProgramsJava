package work;

/*
* 需求：
*   键盘录入一个正整数，
*   定义一个方法，该方法的功能是计算该数字是几位数字，并将位数返回
*   在main方法中打印该数字是几位数
* */

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println(number + "是" + getCount(number) + "位数");
        }else {
            System.out.println("该数不是正整数！");
        }
    }

    public static int getCount(int number){
        int count = 0;
        while (number / 10 != 0){
            number /= 10;
            count++;
        }
        return count + 1;
    }

}

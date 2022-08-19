package test;

/*
* 任务：给你一个整数x，如果x是一个回文整数，打印true，否则，返回false。
* 【回文数是指正序和倒序读都是一样的整数】
* */

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {

        // 核心思路：把数字倒过来，再和原来的数字进行比较。

        // 1.定义数字
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int x = sc.nextInt();

        int temp = x;   // 定义一个临时变量记录x原来的值，用于最后进行比较

        int num = 0;    // num表示最终倒过来的数

        if (x >= 0){
            // 2.利用循环从右往左获取每一位数字
            while (x != 0){
                int ge = x % 10;
                // 把当前获取到的数字拼接到最右边
                num = num * 10 + ge;
                // 修改一下x记录的值
                x = x / 10;
            }

            // 3.打印最终的结果
            System.out.println(num == temp);
        }else {
            System.out.println(false);
        }

    }
}

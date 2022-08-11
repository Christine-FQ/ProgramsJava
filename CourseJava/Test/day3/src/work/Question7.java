package work;

/*
* 键盘录入一个三位数，求这个三位数每一位的数字和。
* */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int number = sc.nextInt();

        int one = number % 10;
        int ten = number / 10 % 10;
        int hundred = number / 100 % 10;

        int result = one + ten + hundred;
        System.out.println("每一位的数字和为：" + result);

    }
}

/*运行结果
*
* 请输入一个三位数：145
* 每一位的数字和为：10
*
* */

package work;

/*
* 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
* 将两数相除，要求不使用乘法、除法和 % 运算符，得到商和余数。
* */

import java.util.Scanner;

public class Question3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.print("请输入除数：");
        int divisor = sc.nextInt();

        int result = 0;

        if (dividend > 0 && divisor > 0){
            while (dividend >= divisor){
                dividend -= divisor;
                result++;
            }
            System.out.println("商：" + result);
            System.out.println("余数：" + dividend);
        }else {
            System.out.println("被除数和除数均为正数！");
        }

    }
}

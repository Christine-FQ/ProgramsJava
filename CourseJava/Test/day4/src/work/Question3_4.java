package work;

/*
* 给你一个整数 x ，如果 x 是一个回文整数，打印 true ，否则，返回 false 。
* */

import java.util.Scanner;

public class Question3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = sc.nextInt();

        int temp = number;

        int num = 0;

        if (number >= 0){
            while (number != 0){
                int ge = number % 10;
                num = num * 10 + ge;
                number /= 10;
            }
            System.out.println(num == temp);
        }else {
            System.out.println(false);
        }

    }
}

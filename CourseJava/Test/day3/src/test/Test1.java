package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位、十位、百位

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int number = sc.nextInt();

        // 2.获取个位
        int ones = number % 10;
        System.out.println("个位：" + ones);
        // 3.获取十位
        int tens = number / 10 % 10;
        System.out.println("十位：" + tens);
        // 4.获取百位
        int hundreds = number / 100 % 10;
        System.out.println("百位：" + hundreds);
    }
}

package test;

/*
* 数字6是一个真正伟大的数字，键盘录入两个整数。
* 如果其中一个为6，最终结果输出true。
* 如果它们的和为6的倍数。最终结果输出true。
* 其他情况都是false。
* */

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;
        System.out.println(result);
    }
}

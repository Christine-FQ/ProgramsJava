package test;

/*
* 键盘录入两个数字，表示一个范围。
* 统计这个范围中，既能被3整除，又能被5整除的数字有多少个？
* */

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();

        int number = 0;
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 && i % 5 == 0){
                number++;
            }
        }
        System.out.println(number);

    }
}

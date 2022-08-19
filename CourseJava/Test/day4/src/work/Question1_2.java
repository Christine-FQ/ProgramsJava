package work;

/*
* 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
* */

import java.util.Scanner;

public class Question1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int c = sc.nextInt();

        int min;

        if (a < b && a < c){
            min = a;
        }else if (b < a && b < c){
            min = b;
        }else {
            min = c;
        }

        System.out.println(min);

    }
}

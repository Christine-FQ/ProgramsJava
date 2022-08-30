package test;

/*
* 任务：求平方根
* 键盘录入一个大于等于2的整数 x，计算并返回 x的平方根。
* 结果只保留整数部分，小数部分将被舍去。
* */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于等于2的整数：");
        int x = sc.nextInt();

        if (x >= 2){

            // 1.使用 for循环和 break
            for (int i = 1;;i++){
                if (i * i > x){
                    System.out.println(i - 1);
                    break;
                }
            }

            // 2.使用 while循环
            /*int count = 1;
            while (count * count <= x){
                count++;
            }
            System.out.println(count - 1);*/

        }else {
            System.out.println("数据输入有误！");
        }

        // 3.使用 Math.sqrt()
        /*if (x >= 2){
            int result = (int) Math.sqrt(x);
            System.out.println(result);
        }else {
            System.out.println("数据输入有误！");
        }*/

    }
}

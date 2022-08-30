package test;

/*
* 任务：求质数
* 键盘录入一个正整数 x，判断该整数是否为一个质数。
* */

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int number = sc.nextInt();

        // 方法1
        /*boolean result = true;
        if (number > 0){
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    result = false;
                    break;
                }
            }
            System.out.println(result);
        }else {
            System.out.println("数据输入有误！");
        }*/

        // 方法2
        /*
        * 一个简化的思路：
        *
        * 以 81为例
        *   1 * 81 = 81
        *   3 * 27 = 81
        *   9 * 9 = 81
        *
        * 以 81的平方根 9为中心，设 a * b = 81
        * 那么 a和 b中，其中有一个一定 >= 9，另一个一定 <= 9
        * */
        boolean flag = true;
        if (number > 0){
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
        }else {
            System.out.println("数据输入有误！");
        }

    }
}

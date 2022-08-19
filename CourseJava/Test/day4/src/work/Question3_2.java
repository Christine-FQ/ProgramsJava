package work;

/*
* 需求：键盘录入两个数字，表示一个范围。统计这个范围中，既能被3整除，又能被5整除数字有多少个？
* */

import java.util.Scanner;

public class Question3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int number2 = sc.nextInt();

        int count = 0;

        if (number1 > number2){
            for (int i = number2; i <= number1; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    count++;
                }
            }
        }else {
            for (int i = number1; i <= number2; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}

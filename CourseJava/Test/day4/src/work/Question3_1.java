package work;

/*
* 键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
* */

import java.util.Scanner;

public class Question3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int number2 = sc.nextInt();

        int sum = 0;

        /*可以使用三目运算符比较两个数的大小，再使用for循环

        //获取最大值和最小值
        int max = number1 > number2 ? number1 : number2;
        int min= number1 < number2 ? number1 : number2;

		//累加求和
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        * */

        if (number1 > number2){
            for (int i = number2; i <= number1; i++){
                sum += i;
            }
        }else {
            for (int i = number1; i <= number2; i++){
                sum += i;
            }
        }

        System.out.println(sum);

    }
}

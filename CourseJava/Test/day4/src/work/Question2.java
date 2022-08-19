package work;

/*
* 模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。

  要求：

	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算
	(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:

		请输入第一个整数: 30

		请输入第二个整数: 40

		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1

		控制台输出:30+40=70
* */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int number2 = sc.nextInt();
        System.out.print("请输入您要进行的运算（1-加法 2-减法 3-乘法 4-除法）：");
        int alu = sc.nextInt();

        int result;

        switch (alu){
            case 1:
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case 4:
                System.out.println(number1 + " / " + number2 + " = " + (number1 * 0.1 / number2));
                break;
            default:
                System.out.println("暂不支持该运算！");
                break;
        }

    }
}

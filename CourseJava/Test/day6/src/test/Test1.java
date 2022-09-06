package test;

/*
* 需求：定义一个方法，在方法内部定义两个变量。求出它们的和并进行打印。
* */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Sum1();

        Sum2(1, 1);
        rectangleCircumference(1.0,  2.5);
        circleArea(2.0);

        System.out.println("sum3 = " + Sum3(1, 1));

        double area1 = rectangleArea(1.0, 2.0);
        double area2 = rectangleArea(3.0, 0.5);
        if (area1 > area2){
            System.out.println("area1 > area2");
        }else if (area1 < area2){
            System.out.println("area1 < area2");
        }else {
            System.out.println("area1 = area2");
        }

    }

    // 1.最简单的方法定义
    public static void Sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
    }

    // 2.带参数的方法定义
    public static void Sum2(int number1, int number2){
        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
    /*
    * 需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
    * */
    public static void rectangleCircumference(double width, double height){
        double circumference = (width + height) * 2;
        System.out.println("circumference = " + circumference);
    }
    /*
    * 需求：定义一个方法，求圆的面积，将结果在方法中进行打印。
    * */
    public static void circleArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("area = " + area);
    }

    // 3.带返回值方法的定义
    public static int Sum3(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
    /*
    * 需求：定义方法，比较两个长方形的面积。
    * */
    public static double rectangleArea(double width, double height){
        double area = width * height;
        return area;
    }

}

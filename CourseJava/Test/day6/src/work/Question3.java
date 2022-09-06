package work;

/*
* 需求：
*   在主方法中通过键盘录入三个整数，
*   定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
* */

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.print("请输入第一个整数：");
        int number2 = sc.nextInt();
        System.out.print("请输入第一个整数：");
        int number3 = sc.nextInt();
        //printNumber1(number1, number2, number3);
        printNumber2(number1, number2, number3);
    }

    public static void printNumber1(int a, int b, int c){

        int[] arr = {a, b, c};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                int temp = arr[0];
                arr[0] = max;
                arr[i] = temp;

            }
            if (min > arr[i]){
                min = arr[i];
                int temp = arr[arr.length - 1];
                arr[arr.length - 1] = min;
                arr[i] = temp;
            }
        }
        System.out.print("从大到小的顺序是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void printNumber2(int a, int b, int c){
        int max, mid, min;

        max = (a > b) ? a : b;
        max = (c > max) ? c : max;

        min = (a < b) ? a : b;
        min = (c < min) ? c : min;

        /*
        * 三个整数的和减去max，再减去min，就是中间数mid的值
        * */
        mid = (a + b + c) - (max + min);

        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);
    }

}

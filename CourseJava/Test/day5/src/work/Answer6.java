package work;

/*
解题思路：
1.定义原数组arr，和一个比原数组长度大1的新数组brr
2.通过键盘录入一个整数数字number
3.定义变量index用于记录number存放的索引位置
4.遍历数组，小于或等于number的元素直接存放到原来的位置，大于number的元素往后移动一个位置
5.存放结束后，中间会空出一个位置，这个位置就是index记录的值，把number存放在这个索引处
6.最终遍历新数组打印结果
 */

import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {

        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};

        int[] brr = new int[arr.length + 1];

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = sc.nextInt();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= number){
                brr[i] = arr[i];
                index += 1;
            }else {
                brr[i + 1] = arr[i];
            }
        }

        brr[index] = number;

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}

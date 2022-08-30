package work;

/*
* 需求：
* 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
* 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
* */

/*
* 我的解题思路：
* 1.在原数组的末尾随意增加一个元素
* 2.用录入的数字取代增加的那个元素
* 3.遍历整个数组，末尾的元素与前面的每一个元素进行比较，从而实现数组的所有元素从小到大排列
* */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91, 0};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = sc.nextInt();

        arr[arr.length - 1] = number;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[arr.length - 1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*以上两个for循环可以合并为一个for循环*/
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
            System.out.print(arr[i] + " ");
        }*/
        
    }
}

package test;

/*
* 需求：打乱数组中的数据
* 定义一个数组，存入1-5。要求打乱数组中所有数据的顺序
* */

import java.util.Random;

public class Test12 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

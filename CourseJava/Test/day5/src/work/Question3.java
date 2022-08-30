package work;

/*
* 需求：
* 创建一个长度为6的整数数组。
* 请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
* */

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {

        int[] arr = new int[6];

        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("\n" + sum);

    }
}

package test;

/*
* 需求：遍历数组求和
* 生成10个1~100之间的随机数存入数组
* （1）求出所有数据的和
* （2）求所有数据的平均数
* （3）统计有多少个数据比平均值小
* */

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];

        // 生成10个1~100的随机数存入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }

        //（1）求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);

        //（2）求所有数据的平均数
        double avg = sum / 10.0;
        System.out.println("avg = " + avg);

        //（3）统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}

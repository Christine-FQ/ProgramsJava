package test;

/*
* 需求：求最值
* 已知数组元素为[33，5，22，44，55]
* 请找出数组中最大值并打印在控制台
* */

public class Test9 {
    public static void main(String[] args) {

        int[] arr = {33, 5, 22, 44, 55};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}

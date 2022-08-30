package work;

/*
* 需求：现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
* */

public class Question2 {
    public static void main(String[] args) {

        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        double min = arr[0];
        double result = 0;

        for (int i = 1; i < arr.length; i++) {
            result = (min > arr[i]) ? arr[i] : min;
        }

        System.out.println(result);

    }
}

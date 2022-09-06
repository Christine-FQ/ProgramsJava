package test;

/*
* 需求：定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处。
* */

public class Test4 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        System.out.println(isExist(arr, 11));

    }

    public static boolean isExist(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                return true;
            }
        }
        return false;
    }

}

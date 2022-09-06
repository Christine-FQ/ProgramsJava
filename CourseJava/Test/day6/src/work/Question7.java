package work;

/*
* 需求：
*   定义一个方法fill(int[] arr, int value)
*   将数组arr中的所有元素的值改为value
* */

public class Question7 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        arr = fill(arr, 66);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

}

package work;

/*
* 需求：
*   定义一个方法copyOf(int[] arr, int newLength)
*   将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
* */

public class Question9 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] brr = copyOf(arr, 4);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength){
        int[] brr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }

}

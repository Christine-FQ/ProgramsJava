package test;

/*
 * 需求：定义一个方法copyOfRange(int[] arr, int from, int to)
 * 功能：
 *   将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，将新数组返回。
 * */

public class Test5 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        int[] brr = copyOfRange(arr, 1, 4);

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        int j = 0;
        for (int i = from; i < to; i++) {
            brr[j] = arr[i];
            j++;
        }
        return brr;
    }

}

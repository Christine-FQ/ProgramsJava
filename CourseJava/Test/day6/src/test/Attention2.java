package test;

public class Attention2 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change()方法前：arr[1] = " + arr[1]); // 20
        change(arr);
        System.out.println("调用change()方法后：arr[1] = " + arr[1]); // 200
    }

    public static void change(int[] arr){
        arr[1] = 200;
    }

}

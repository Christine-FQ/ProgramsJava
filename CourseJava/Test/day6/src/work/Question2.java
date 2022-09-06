package work;

/*
* 需求：定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
* */

public class Question2 {

    public static void main(String[] args) {
        System.out.println(getMax1(1, 2, 3));
        System.out.println(getMax2(10, 30, 20));
    }

    public static int getMax1(int a, int b, int c){
        int max;
        if (a > b && a > c){
            max = a;
        }else if (b > a && b > c){
            max = b;
        }else {
            max = c;
        }
        return max;
    }

    public static int getMax2(int a, int b, int c){
        int max = (a > b) ? a : b;
        max = (c > max) ? c : max;
        return max;
    }

}

package test;

public class Test4 {
    public static void main(String[] args) {

        int i = 10, j = 10;
        boolean k = ++i < 5 & ++j < 5;
        System.out.println("k = " + k); // k = false
        System.out.println("i = " + i); // i = 11
        System.out.println("j = " + j); // j = 11

        /*
        *   短路逻辑运算符具有短路效果
        *   简单理解，当左边的表达式能确定最终的结果时，右边就不会参与运行了
        * */
        int a = 10, b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println("result = " + result);   // result = false
        System.out.println("a = " + a); // a = 11
        System.out.println("b = " + b); // b = 10
    }
}

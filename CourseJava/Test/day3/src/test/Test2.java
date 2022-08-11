package test;

public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;    // 先用后加：a先赋值给b，a再加1
        System.out.println("a = " + a);  // a = 11
        System.out.println("b = " + b);  // b = 10

        int i = 10;
        int j = ++i;    // 先加后用：i先加1，i再赋值给j
        System.out.println("i = " + i); // i = 11
        System.out.println("j = " + j); // j = 11
    }
}

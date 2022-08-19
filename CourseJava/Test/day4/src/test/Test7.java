package test;

public class Test7 {
    public static void main(String[] args) {

        // 求1-5之间的和
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println(sum);    // 15
        /*
        * 1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效。
        *
        * 2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效
        *   当本次循环结束后，变量就会在内存中消失
        *   第二次循环开始的时候，又会重新定义一个新的变量。
        * */

    }
}

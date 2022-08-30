package test;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100);   // 表示生成随机数的范围是 [0, 100)【这个范围只能从0开始，到number-1结束】
        System.out.println(number);

        // 生成任意范围之间的随机数
        /*
        * 以 [7, 15]为例
        * 1.尾部 - 头部 + 1【15 - 7 + 1 = 9】
        * 2.最终的结果 + 头部
        * */
        int num = random.nextInt(9) + 7;
        System.out.println(num);

    }
}

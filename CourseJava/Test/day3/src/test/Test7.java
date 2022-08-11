package test;

/*
* 一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
* 请用程序实现获取这三个和尚的最高身高。
* */

public class Test7 {
    public static void main(String[] args) {

        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int max = (height1 > height2) ? height1 : height2;
        max = (max > height3) ? max : height3;

        System.out.println("max = " + max);

    }
}

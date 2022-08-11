package work;

/*
* 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
* 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
* 那么红茶和绿茶现在的钱一样多，请问对吗？
* */

public class Question2 {
    public static void main(String[] args) {

        int red = 21, green = 24;

        red = red * 2 + 3;
        green *= 2;

        String result = (red == green) ? "一样多" : "不一样多";

        System.out.println("红茶妹妹现在有" + red + "元钱");
        System.out.println("绿茶妹妹现在有" + green + "元钱");
        System.out.println("她们现在的钱" + result);

    }
}

/*运行结果
*
    红茶妹妹现在有45元钱
    绿茶妹妹现在有48元钱
    她们现在的钱不一样多

* */

package work;

/*
* 某小伙想定一份外卖，商家的优惠方式如下：
*   鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
*   订单满30元8折优惠。鱼香肉丝优惠价16元。但是优惠价和折扣不能同时使用。
* 那么这个小伙要点这三样东西，最少要花多少钱？
* */

public class Question3 {
    public static void main(String[] args) {

        double way1 = 24 + 8 + 3;
        way1 = (way1 >= 30) ? way1 * 0.8 : way1;

        double way2 = 16 + 8 + 3;

        double result = (way1 < way2) ? way1 : way2;

        System.out.println("这个小伙最少要花" + result + "元钱");

    }
}

/*运行结果
*
*   这个小伙最少要花27.0元钱
*
* */

package work;

/*
* 某商场购物可以打折，具体规则如下：

	普通顾客购不满100元不打折，满100元打9折；

	会员购物不满200元打8折，满200元打7.5折；

	不同打折规则不累加计算。

  请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
* */

import java.util.Scanner;

public class Question1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请录入顾客的类别（0表示普通顾客，1表示会员）：");
        int customer = sc.nextInt();
        System.out.print("请输入商品总额：");
        double money = sc.nextDouble();

        switch (customer){
            case 0:
                if (money >= 0 && money < 100){
                    System.out.println("应付总额为：" + money);
                }else if (money >= 100){
                    money = money * 0.9;
                    System.out.println("应付总额为：" + money);
                }else {
                    System.out.println("您输入的金额有误！");
                }
                break;
            case 1:
                if (money >= 0 && money < 200){
                    money = money * 0.8;
                    System.out.println("应付总额为：" + money);
                }else if (money >= 200){
                    money = money * 0.75;
                    System.out.println("应付总额为：" + money);
                }else {
                    System.out.println("您输入的金额有误！");
                }
                break;
            default:
                System.out.println("您输入的顾客类别有误！");
                break;
        }

    }
}

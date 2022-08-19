package test;

/*
* 商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
* 假设商品总价为1000
* 键盘录入会员级别，并计算出实际支付的钱。
* 会员1级：打9折
* 会员2级：打8折
* 会员3级：打7折
* 非会员：不打折，要打也是打骨折
* */

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入商品总价：");
        double price = sc.nextDouble();
        System.out.println("是否为VIP用户（1为是 0为否）：");
        int isVIP = sc.nextInt();

        if (isVIP >= 0 && isVIP <=1){
            if (isVIP == 1){
                System.out.print("请输入会员等级：");
                int vip = sc.nextInt();
                if (vip >= 1 && vip <= 3){
                    if (vip == 1){
                        System.out.println("尊敬的1级VIP用户，您已享受9折优惠，需支付的商品总额为：" + price * 0.9);
                    }else if (vip == 2){
                        System.out.println("尊敬的2级VIP用户，您已享受8折优惠，需支付的商品总额为：" + price * 0.8);
                    }else {
                        System.out.println("尊敬的3级VIP用户，您已享受7折优惠，需支付的商品总额为：" + price * 0.7);
                    }
                }else {
                    System.out.println("请输入有效的会员等级！");
                }
            }else {
                System.out.println("您不是会员，需支付的商品总额为：" + price);
            }
        }else {
            System.out.println("输入有误！");
        }

    }
}

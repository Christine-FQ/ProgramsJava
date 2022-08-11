package test;

/*
*   您和您的约会对象正在餐厅里约会。
*   键盘录入两个整数，表示你和你约会对象衣服的时髦度。（手动录入0-10之间的整数，不能录入其他）
*   如果你的时髦度大于你对象的时髦程度，就相亲成功，输出true。
*   否则输出false。
* */

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 1.键盘录入两个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的衣服时髦度：");
        int a = sc.nextInt();
        System.out.print("请输入约会对象的衣服时髦度：");
        int b = sc.nextInt();
        // 2.进行比较
        boolean result = a > b;
        // 3.打印结果
        System.out.println(result);
    }
}

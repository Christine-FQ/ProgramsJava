package test;

/*
* 跳转控制语句
* */

public class SkipLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;   // 结束本次循环，继续下次循环。
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }

        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                break;  // 结束整个循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }

        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3){
                break;  // 结束整个循环
            }
        }

    }
}

/*
* 运行结果：
* 小老虎在吃第1个包子
* 小老虎在吃第2个包子
* 小老虎在吃第4个包子
* 小老虎在吃第5个包子
* ----------
* 小老虎在吃第1个包子
* 小老虎在吃第2个包子
* ----------
* 小老虎在吃第1个包子
* 小老虎在吃第2个包子
* 小老虎在吃第3个包子
* */

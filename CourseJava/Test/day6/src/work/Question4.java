package work;

/*
* 需求：数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
*   请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
* */

public class Question4 {

    public static void main(String[] args) {
        System.out.println(getAbs(2.3));
        System.out.println(getAbs(-4.5));
    }

    public static double getAbs(double number){
        double abs;
        if (number < 0){
            abs = -number;
        }else {
            abs = number;
        }
        return abs;
    }

}

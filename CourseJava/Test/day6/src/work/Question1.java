package work;

/*
* 需求：定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
* */

public class Question1 {

    public static void main(String[] args) {
        System.out.println(getMin(2.1, 2.2));
    }

    public static double getMin(double number1, double number2){
        return (number1 < number2) ? number1 : number2;
    }

}

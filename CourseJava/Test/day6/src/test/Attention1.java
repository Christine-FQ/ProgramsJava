package test;

public class Attention1 {

    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change1()方法前：number =  " + number);    // 100
        change1(number);
        System.out.println("调用change1()方法后：number =  " + number);    // 100

        number = change2(number);
        System.out.println("调用change2()方法后：number =  " + number);    // 200
    }

    public static void change1(int number){
        number = 200;
    }

    public static int change2(int number){
        number = 200;
        return number;
    }

}

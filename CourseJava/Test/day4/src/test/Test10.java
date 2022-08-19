package test;

public class Test10 {
    public static void main(String[] args) {

        // 利用while循环打印1-5
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println("----------");

        int j = 1;
        for (; j <= 5; j++){
            System.out.println(j);
        }

        System.out.println("----------");

        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

    }
}

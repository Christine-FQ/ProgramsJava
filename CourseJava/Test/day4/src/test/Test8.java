package test;

public class Test8 {
    public static void main(String[] args) {

        // 求1-100之间的偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++){ // 快速生成：100.fori
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);    // 2550

        int result = 0;
        for (int j = 0; j <= 100; j += 2){
            result += j;
        }
        System.out.println(result);

    }
}

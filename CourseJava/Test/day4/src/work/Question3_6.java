package work;

/*
* 已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
* */

public class Question3_6 {
    public static void main(String[] args) {

        for (int i = 1949; i <= 2019; i++){
            if ((2019 - i) % 12 == 0){
                System.out.println(i);
            }
        }

    }
}

/*
* 运行结果
* 1959
* 1971
* 1983
* 1995
* 2007
* 2019
* */

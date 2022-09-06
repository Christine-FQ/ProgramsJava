package work;

/*
 * 需求：
 *   一个大V直播抽奖，奖品是现金红包，分别有{2, 588, 888, 1000, 10000}五个奖金。
 *   请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
 * */

import java.util.Random;

public class Answer11 {

    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        draw(arr);
    }

    public static void draw(int[] arr) {    // 1.定义存放多个奖金的数组arr

        // 2.定义数组brr准备存放已经抽过的奖金，该数组长度与arr相等
        int[] brr = new int[arr.length];

        // 3.定义数组brr的索引
        int index = 0;

        Random random = new Random();
        int i;

        // 5.写一个while循环，如果 index < arr.length，说明奖项没有被抽完，则继续抽取
        while (index < arr.length){

            // 6.使用随机数产生一个随机索引 i
            i = random.nextInt(arr.length);

            // 7.使用 isExist()方法判断 brr中是否存在 arr[i]
            if (!isExist(brr, arr[i])){  // 如果不包含，打印，并且将它放入brr数组中表示已经抽取过，同时index加1
                System.out.println(arr[i] + "元的奖金被抽出");
                brr[index] = arr[i];
                index++;
            }

        }

    }

    // 4.定义方法，判断数组中是否存在某个数字，存在返回true，否则返回false
    public static boolean isExist(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

}

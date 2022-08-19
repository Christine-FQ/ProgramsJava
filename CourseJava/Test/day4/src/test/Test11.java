package test;

/*
* 任务：打印折纸的次数
*   世界最高峰是珠穆朗玛峰（8844.43米=8844430毫米），
*   假如我有一张足够大的纸，它的厚度是0.1毫米，
*   请问：我折叠多少次，可以折成珠穆朗玛峰的高度？
* */

public class Test11 {
    public static void main(String[] args) {

        // 此时我们不知道循环的次数和范围，只知道循环的结束条件，所以用while
        int count = 0;
        double height = 0.1;
        while (height <= 8844430){
            count++;
            height *= 2;
        }
        System.out.println(count);  // 27

        int c = 0;
        for (double h = 0.1; h < 8844430; h *= 2) {
            c++;
        }
        System.out.println(c);

    }
}

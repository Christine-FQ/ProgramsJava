package test;

public class Test5 {
    public static void main(String[] args) {

        int[] arr = new int[]{11, 12, 13};
        System.out.println(arr);    // [I@4c203ea1 —— arr的地址值 —— 数组的地址值表示数组在内存中的位置
        /*
        * 数组地址值的含义：

        * [：表示当前是一个数组
        * I：表示当前数组里的元素都是 int类型的
        * @：表示一个间隔符号 <固定格式>
        * 4c203ea1：数组真正的地址值 <十六进制>

        * 平时我们会习惯性地把这个整体叫做数组的地址值
        * */

        /*利用索引对数组中的元素进行访问*/
        // 1.获取数组里面的元素
        System.out.println(arr[0]); // 11
        // 2.把数据存储到数组当中
        arr[0]  = 100;  // 一旦覆盖之后，原来的数据就不存在了
        System.out.println(arr[0]); // 100

        /*数组的遍历*/
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        /*
        * 快速生成数组遍历的方式：数组名.fori
        * */

    }
}

package work;

/*
* 需求：
*   定义一个方法equals(int[] arr1, int[] arr2)，
*   比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
* */

public class Question6 {

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        int[] arr3 = {22, 33, 44, 55, 66};
        int[] arr4 = {11};

        System.out.println(isEqual(arr1, arr2));
        System.out.println(isEqual(arr1, arr3));
        System.out.println(isEqual(arr1, arr4));
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]){
                    return true;
                }
            }
        }
        return false;
    }

}

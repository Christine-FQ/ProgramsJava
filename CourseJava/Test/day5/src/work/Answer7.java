package work;

/*
* 需求：
* 定义一个数组其中包含多个数字。
* 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
* */

// 1.定义一个新数组，把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边
/*
* 解题思路：
* 1.定义一个和arr长度一样的新数组brr
* 2.定义变量left，初始值是0，从左边开始放置奇数
* 3.定义变量right，初始值是arr.length-1，从右边开始放置偶数
* 4.对arr进行遍历
* 5.如果元素是奇数，则放在brr的左边，left变量加一
* 6.如果元素是偶数，则放在brr的右边，right变量减一
* 7.遍历brr并打印
* */

// 2.不定义新数组，找到左边的偶数，与右边的奇数互换位置

public class Answer7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] brr = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                brr[left] = arr[i];
                left++;
            }else {
                brr[right] = arr[i];
                right--;
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}

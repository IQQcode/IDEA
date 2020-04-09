package iqqcode.algorithm.sort;


/**
 * @Author: Mr.Q
 * @Date: 2020-04-09 15:35
 * @Description:优化的冒泡排序,增加标志位,如果有序则不交换
 */
public class OptimalBubble {
    public static void optimalBubble(int[] arr) {
        boolean flag = false;
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) { //此趟排序均有序
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //此趟排序没有进行数值交换
                    flag = true;
                }
            }
            //在一趟排序中没有发生过交换
            if (!flag) {
                break;
            }else {
                //重置flag,进行下次判断
                flag = false;
            }
        }
    }
}

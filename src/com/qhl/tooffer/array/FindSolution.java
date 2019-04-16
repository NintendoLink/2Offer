/**
 * @Author: LinK
 * @Date: 2019/4/16 15:15
 */

package com.qhl.tooffer.array;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindSolution {
    /**
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target,int[][] array){
        /**
         * 思路：从左下角开始遍历，如果target大，则右移；反之在，则上移;或者选取左上角元素作为开始，同样的道理
          */

        int row = array.length-1;
        int col = 0;
        while (row >= 0 && col <array[0].length){
            if (target > array[row][col]){
                col ++;
            }else if (target == array[row][col]){
                return true;
            }else {
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}}  ;
        System.out.println(Find(15,array));
    }
}

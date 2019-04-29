/**
 * @Author: LinK
 * @Date: 2019/4/29 10:44
 */

package com.qhl.tooffer.array;

/**
 * 给一个数组，返回它的最大连续子序列的和
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 */
public class FindGreatestSumOfSubArraySolution {


    /**
     * 思路
     * 算法时间复杂度O（n） 用total记录累计值，maxSum记录和最大 基于思想：对于一个数A，若是A的左边累计数非负，那么加上A能使得值不小于A，认为累计值对 整体和是有贡献的。如果前几项累计值负数，则认为有害于总和，total记录当前值。 此时 若和大于maxSum 则用maxSum记录下来
     * @param array
     * @return
     */
    public static int solution(int[] array){

        if (array == null || array.length <= 1){
            return 0;
        }

        int total = array[0];
        int maxSum = array[0];

        for (int i = 1;i< array.length;i++){
            if (total >0){
                total += array[i];
            }else {
                total = array[i];
            }

            if (maxSum < total){
                maxSum = total;
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] array = {6,-3,-2,7,-15,1,2,2};

        System.out.println(solution(array));
    }
}

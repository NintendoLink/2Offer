/**
 * @Author: LinK
 * @Date: 2019/4/29 11:16
 */

package com.qhl.tooffer.array;

/**
 * ????
 * 数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class InversePairsSolution {


    /**
     * 思路
     * 1、利用o(n2)的算法实现
     * 2、利用递归算法实现o(nlgn)的复杂度
     * @param array
     * @return
     */
    public static int solution(int[] array){

        if (array == null || array.length ==0){
            return 0;
        }

        int count = 0;
        for (int i =0;i<array.length;i++){
           for (int j = i+1;j<array.length;j++){
               if (array[i]>array[j]){
                   count++;
               }
           }
        }
        return count % 1000000007;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(solution(array));
    }
}

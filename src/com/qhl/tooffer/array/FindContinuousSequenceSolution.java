/**
 * @Author: LinK
 * @Date: 2019/4/28 14:11
 */

package com.qhl.tooffer.array;

import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 */
public class FindContinuousSequenceSolution {
    /**
     * 序列为自然序列1，2，3，4，5，6.....
     * 初始化两个指针，分别为自然序列的最小值small1和big2
     * 如果small 与big之间的值的和等于num，则接入到新的list中，并将big++
     * 如果小于，则big++
     * 如果大于，则small++（去掉较小的那个值）
     * 退出条件small>= num
     * @param num
     * @return
     */
    public static ArrayList<ArrayList<Integer>> solution(int num){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int small = 1;
        int big = 2;

        ArrayList<Integer> list =new ArrayList<>();
        while(small != (num+1)/2){
            if (sum(small,big)== num){
                for (int i = small;i<=big;i++){
                    list.add(i);
                }
                res.add(new ArrayList<>(list));
                list.clear();
                big++;
            }else if (sum(small,big) < num){
                big++;
            }else {
                small++;
            }
        }
        return res;
    }

    public static int sum(int small,int big){
        int sum = 0;
        for(int i =small;i<=big;i++){
            sum += i;
        }

        return sum;
    }

    /**
     * 改良版：
     * 对于任意的升序序列数组，给出num，求出和为num的连续数组中的数列
     * @param array
     * @param num
     * @return
     */

    public static ArrayList<ArrayList<Integer>> arraySolution(int[] array,int num){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (array == null || array.length ==0){
            return res;
        }
        int small = 0;
        int big = 1;

        ArrayList<Integer> list = new ArrayList<>();
        while (small <= big &&  big <= array.length-1){

            if (arraySum(array,small,big) == num){

                for (int i = small;i<=big;i++){
                    list.add(array[i]);
                }

                big++;
                res.add(new ArrayList<>(list));
                list.clear();
            }else if (arraySum(array,small,big) < num){
                big++;
            }else {
                small++;
            }
        }
        return res;
    }


    public static int arraySum(int[] array,int small,int big){

        int sum = 0;
        if (small >= big){
            return sum;
        }

        for(int i  =small;i<= big;i++){
            sum += array[i];

        }
        return sum;
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println(arraySolution(array,9));

    }
}

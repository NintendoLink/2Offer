/**
 * @Author: LinK
 * @Date: 2019/4/28 11:20
 */

package com.qhl.tooffer.array;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSumSolution {

    /**
     * 思路
     * 1、两次遍历
     * 2、两个指针，一个指向数组的头，一个指向数组的尾，时间复杂度o(n)
     * @param array
     * @param num
     * @return
     */
    public static ArrayList FindNumbersWithSum(int[] array,int num){

        ArrayList<Integer> list = new ArrayList<>();

//        if (array == null || array.length <=1){
//            return  list;
//        }
//
//        for (int i =0;i<array.length;i++){
//            for (int j = i+1;j<array.length;j++){
//                if (array[i] + array[j] == num){
//                    list.add(array[i]);
//                    list.add(array[j]);
//                }
//            }
//        }
//
//        return list;


        int i = 0;
        int j = array.length-1;

        for (;i < j;){
            if (array[i] +array[j] == num){
                list.add(array[i]);
                list.add(array[j]);

                i++;
                j--;
            }else if (array[i] + array[j] < num){
                i++;
            }else {
                j--;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,3,9,10,11,12};

        System.out.println(FindNumbersWithSum(array,21));
    }
}

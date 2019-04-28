/**
 * @Author: LinK
 * @Date: 2019/4/28 15:40
 */

package com.qhl.tooffer.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArraySolution {

    /**
     * 思路：
     * 1、利用ArrayList的额外的存储空间
     * 2、利用刨坑法，但是这样会打乱顺序。
     * @param array
     */
    public static void solution(int[] array){
        List<Integer> oList = new ArrayList<>();
        List<Integer> jList = new ArrayList<>();

        for (Integer integer:array){
            if (integer %2 ==0){
                oList.add(integer);
            }else {
                jList.add(integer);
            }
        }

        jList.addAll(oList);

        for (int i =0;i<array.length;i++){
            array[i] = jList.get(i);
        }
//        int low = 0;
//        int high = array.length-1;
//
//        int temp = 0;
//        while (low < high){
//            while (low < high && array[low] % 2 ==1){
//                low++;
//            }
//            while (low <high && array[high] %2 ==0){
//                high--;
//            }
//
//            temp = array[low];
//            array[low] = array[high];
//            array[high] = temp;
//        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        solution(array);

        for (Integer integer:array){
//            System.out.println(integer);
        }

//        判断一个数能不能被2整除
//        System.out.println(5&1);

        int n =10000;
        for (int i =0;i<n;i++){
            if ((i&2) == 0){
                System.out.println(i);
            }
        }

    }
}

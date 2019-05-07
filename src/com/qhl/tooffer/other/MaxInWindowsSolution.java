/**
 * @Author: LinK
 * @Date: 2019/5/6 13:46
 */

package com.qhl.tooffer.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * {2,3,4,2,6,2,5,1}
 */
public class MaxInWindowsSolution {

    /**
     * 思路
     * 1、普通思路 o(m*n)
     * 2、普通思路的改进版，最坏情况下 o(m*n) 最好情况下 o(n)
     * 3、o(n)办，利用双端队列
     * @param num
     * @param size
     * @return
     */
    public static ArrayList<Integer> solution(int[] num,int size){


        ArrayList<Integer> list = new ArrayList<>();

        if (num ==null || num.length==0 ||
                size<=0 || size>= num.length){
            return list;
        }
        //思路1，普通版
//        int[] temp = new int[size];
//
//        for(int i = 0;i< num.length-size+1;i++){
//            temp = Arrays.copyOfRange(num,i,i+size);
//            list.add(getMaxInArray(temp));
//        }
//
//        return list;

        //思路2，改进的普通版
        int max = 0;
        int[] temp = new int[size];
        temp = Arrays.copyOfRange(num,0,size);
        max = getMaxInArray(temp);
        list.add(max);
        for (int i = 1;i<num.length-size+1;i++){

            if (num[i-1] == max){
                temp = Arrays.copyOfRange(num,i,i+size);
                max = getMaxInArray(temp);
                list.add(max);
                continue;
            }

            max = max < num[i+size-1]? num[size+i-1]:max;

            list.add(max);

        }
        return list;
    }

   private static int getMaxInArray(int[] array){

        int res = array[0];
        for (int i = 1;i<array.length;i++){
            if (array[i] > res){
                res = array[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11,13,15};
        List<Integer> list = solution(array,4);

        list.forEach(integer -> System.out.println(integer));
    }
}

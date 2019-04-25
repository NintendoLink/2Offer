/**
 * @Author: LinK
 * @Date: 2019/4/25 14:52
 */

package com.qhl.tooffer.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找出数组中最小的k个数
 */

public class GetLeastNumbersSolution {


    /**
     * 思路：
     * 1、首先利用数组中的前k个数构建大顶堆
     * 2、从数组k+1个数开始遍历，如果值小于堆顶，则将此值加入到堆中，重新构建大顶堆。
     * @param input
     * @param k
     * @return
     */
    public static List<Integer> solution(int[] input,int k){

        List<Integer> list = new ArrayList<>();
        if (k<=0 || k>input.length || input ==null){
            return list;
        }

        int[] kArray = Arrays.copyOfRange(input,0,k);

        for (int i = kArray.length/2 - 1;i>=0;i--){
            ajustHeap(i,kArray.length,kArray);
        }

        for (int i =k;i<input.length-1;i++){
            if (input[i] < kArray[0]){
                kArray[0] = input[i];
                ajustHeap(0,kArray.length,kArray);
            }
        }

        for (int i =0;i<kArray.length;i++){
            list.add(kArray[i]);
        }

        return list;
    }

    /**
     * 使得堆的第i+1个元素满足堆的性质。
     * @param i
     * @param length
     * @param heap
     * @return
     */
    public static int[] ajustHeap(int i ,int length,int heap[]){

        int temp = heap[i];

        for(int k =2*i+1; k<length;k=2*k+1){
            if(k+1<length && heap[k] < heap[k+1]){
                k++;
            }
            if(heap[i] < heap[k]){
                heap[i] = heap[k];
                i=k;
            }else{
                break;
            }
            heap[i] = temp;
        }
        return heap;
    }
    public static void main(String[] args) {
        int[] input = {5,2,3,6,9,7,4,1,8};
        for(Integer number : solution(input,5)){
            System.out.println(number);
        }
    }
}

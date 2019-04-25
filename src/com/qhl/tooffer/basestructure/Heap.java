///**
// * @Author: LinK
// * @Date: 2019/4/25 11:18
// */
//
//package com.qhl.tooffer.basestructure;
//
//public class Heap {
//
//    public static int[] ajustHeap(int i ,int length,int heap[]){
//
//        int temp = heap[i];
//
//        for(int k =2*i+1; k<length;k=2*k+1){
//            if(k+1<length && heap[k] <heap[k+1]){
//                k++;
//            }
//            if(heap[i] <heap[k]){
//                heap[i] = heap[k];
//                i=k;
//            }else{
//                break;
//            }
//            heap[i] = temp;
//        }
//        return heap;
//    }
//
//    public static int[] buildMaxheap(int[] array){
//        for (int i = array.length/2 - 1;i>=0;i--){
//            ajustHeap(i,array.length,array);
//        }
//
//        return array;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {5,4,2,6,9,3,1};
//
//        int[] heap = buildMaxheap(array);
//
//        for (int i =0;i<heap.length;i++){
//            System.out.println(heap[i]);
//        }
//    }
//}

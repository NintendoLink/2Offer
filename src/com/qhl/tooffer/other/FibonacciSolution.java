/**
 * @Author: LinK
 * @Date: 2019/4/16 16:02
 */

package com.qhl.tooffer.other;

public class FibonacciSolution {

    /**
     * 斐波那契数列：现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39,递归简洁，但是效率不高。循环O（N）
     * @param n
     * @return
     */
    public static int Fibonacci(int n){

        /**
         * 思路
         * 1、递归算法
         * 2、非递归算法
         */
        //递归算法
//        if (n == 2 || n ==1){
//            return 1;
//        }else if (n ==0){
//            return 0;
//        }
//        return Fibonacci(n-1) + Fibonacci(  n-2);

        //非递归算法
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int pretwo = 0;
        int preone = 1;

        int res =0;
        for (int i =2;i<=n;i++){

            res = preone+ pretwo;
            pretwo = preone;
            preone =res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }
}

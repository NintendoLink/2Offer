/**
 * @Author: LinK
 * @Date: 2019/4/16 16:23
 */

package com.qhl.tooffer.byteoperation;


/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class NumberOfOneSolution {

    public static int numberof1(int n){
        /**
         * 思路
         * 1、与2，4，8....进行与操作，观察结果是否为1
         * 2、移位运算，大体上一思路1相同
         * 3、n&(n-1)的操作效果是将n的最右边1变成0，看进行了多少次这种运算后n为0为止。
         */

//        long temp = 1;
//        int count =0;
//        for(int i =0;i<32;i++){
//            if ((n&temp) >0){
//                count++;
//            }
//            temp *= 2;
//        }
//        return count;

//        int res = 0;
//        int count =0;
//        while (n!=0){
//            count += n&1;
//            n>>>=1;
//        }
//        return count;

        int count =0;
        while (n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberof1(10));

        System.out.println(101>>2);
    }
}

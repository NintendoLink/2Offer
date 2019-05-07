/**
 * @Author: LinK
 * @Date: 2019/5/6 10:11
 */

package com.qhl.tooffer.other;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 */
public class GetUglyNumberSolution {

    /**
     * 思路：
     * 1、普通解法，时间复杂度过大
     * 2、创建数组保存已经找到的丑数，利用空间换取时间
     * @param index
     * @return
     */
    public static int solution(int index){

        if (index<0){
            return 0;
        }
        //思路1
//        int number = 1;
//        for (int i =1;i<index+1;i++){
//
//            while (!isUlgyNumner(number++));
//        }
//
//        return number-1;

        //思路2
        int[] res = new int[index];

        res[0] =1;

        int m2 =0;
        int m3 =0;
        int m5 =0;

        for (int i =1;i<index;i++){
            int min = Math.min(res[m2] *2,Math.min(res[m3] *3,res[m5]*5));
            res[i] = min;

            m2 = res[m2] == min *2? m2+1:m2;
            m3 = res[m3] == min *3? m3+1:m3;
            m5 = res[m5] == min *5? m5+1:m5;
        }
        return res[index-1];
    }


    public static boolean isUlgyNumner(int n){
        List<Integer> list = getFactor(n);

        if (isPrime(n) && n>5){
            return false;
        }

        for (Integer  integer:list){
            if (isPrime(integer) &&  integer > 5){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getFactor(int n){
        List<Integer> list = new ArrayList<>();
        for (int i =2;i<n/2+1;i++){
            if (n%i==0){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int n){

        for (int i = 2;i<n/2 +1;i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        for (int i =1;i<100;i++){
//            if (isPrime(i)){
//                System.out.println(i);
//            }
//        }

//        int n =100;
//        List<Integer> list = getFactor(n);
//        list.forEach(integer -> System.out.println(integer));

//        for (int i =1;i<21;i++){
//            if (isUlgyNumner(i)){
//                System.out.println(i);
//            }
//        }


        System.out.println(solution(7));
    }
}

/**
 * @Author: LinK
 * @Date: 2019/4/25 10:32
 */

package com.qhl.tooffer.byteoperation;

/**
 * 判断二进制中0的个数
 */
public class NumberOfZeroSolution {

    /**
     * 思路：
     * 32-1的个数
     * @param n
     * @return
     */
    public static int solution(int n){

//        思路一
//        int count = 0;
//        while(n!=0){
//
//            count += n&1;
//            n>>>=1;
//        }
//
//        return 32-count;

//        思路2
        int count = 0;

        while (n != 0){
            count ++;
            n = n&(n-1);
        }
        return 32-count;



//        错误方法
//        int count = 0;
//        while(n != 0) {
//            if((n&1)!=1)
//                count++;
//            n>>>=1;
//        }
//
//        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(74));
    }
}

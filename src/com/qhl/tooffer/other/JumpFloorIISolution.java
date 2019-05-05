/**
 * @Author: LinK
 * @Date: 2019/5/5 11:08
 */

package com.qhl.tooffer.other;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorIISolution {

    /**
     * 思路：由数学推导，f(n) = 2 ^ n
     * @param n
     * @return
     */
    public static int solution(int n){
        int res = 1;
        for (int i =0;i<n;i++){
            res = res *2;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}

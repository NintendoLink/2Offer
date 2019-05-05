/**
 * @Author: LinK
 * @Date: 2019/5/5 10:25
 */

package com.qhl.tooffer.other;

/**
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloorSolution {

    /**
     * 思路：斐波拉契数序列，初始条件n=1:只能一种方法，n=2:两种对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来，所以F(n) = F(n-1) + F(n-2)
     * @param n
     * @return
     */
    public static int solution(int n){

        if (n == 1 || n ==2){
            return n;
        }
        return solution(n-1)+ solution(n-2);

    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}

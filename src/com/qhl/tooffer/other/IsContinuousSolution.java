/**
 * @Author: LinK
 * @Date: 2019/4/30 14:12
 */

package com.qhl.tooffer.other;

import java.util.Arrays;


/**
 * 扑克牌顺子
 *
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
 */
public class IsContinuousSolution {

    /**
     * 思路
     * 首先对数组进行排序
     * 记录0的位置(出现了几个0)
     * 遍历number，求number[i+1] + number[i]-1的累计和
     * 返回 0的数目 >=累计和
     * @param numbers
     * @return
     */
    public static boolean solution(int[] numbers){

        //网上代码
        if (numbers == null || numbers.length ==0){
            return false;
        }
        Arrays.sort(numbers);

        int zeroIndex = -1;
        int count =0;

        for (int i = 0;i<numbers.length-1;i++){
            if (numbers[i] ==0){
                zeroIndex = i;
                continue;
            }

            if (numbers[i] != numbers[i+1]){
                count += numbers[i+1] -numbers[i]-1;
            }else {
                return false;
            }

        }

        return zeroIndex+1>=count;


        //自己代码
//        for (int i =0;i<numbers.length-1;i++){
//            if (numbers[i] ==0){
//                zeroIndex = i;
//            }
//
//            if (numbers[i+1] -numbers[i] ==0 && numbers[i] !=0){
//                return false;
//            }
//
//            if (numbers[i] != 0){
//                count += numbers[i+1] - numbers[i] - 1;
//            }
//
//        }
//
//        return zeroIndex+1 >=  count;
    }


    public static void main(String[] args) {
        int[] array ={1,3,2,4,5};
        System.out.println(solution(array));
    }
}

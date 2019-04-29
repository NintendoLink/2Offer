/**
 * @Author: LinK
 * @Date: 2019/4/29 10:51
 */

package com.qhl.tooffer.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ????
 * 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumberSolution {

    /* 解题思路： * 考虑到大数问题，先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。关键就是制定排序规则。 * 排序规则如下： * 若ab > ba 则 a > b， * 若ab < ba 则 a < b， * 若ab = ba 则 a = b； * 解释说明： * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较 */
    public static String solution(int[] array){

        if (array == null || array.length == 0){
            return "";
        }

        String[] strs = new String[array.length];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i<array.length;i++){
            strs[i] = String.valueOf(array[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 +o2;
                String c2 = o2 +o1;

                return c1.compareTo(c2);
            }
        });

        for (String str : strs){
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        int[] array =  {3,32,321};

//        System.out.println(solution(array));

        System.out.println("38".compareTo("371151156165"));

    }
}

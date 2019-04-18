/**
 * @Author: LinK
 * @Date: 2019/4/18 15:19
 */

package com.qhl.tooffer.array;

/**
 * 翻转字符串
 */
public class FanzhuanSolution {

    /**
     *
     * @param str
     * @return
     */
    public static String Fanzhuan(String str){

        /**
         * 思路
         * 1、利用string.split分割，然后从后向前循环，拼接到StringBuffer中
         * 2、先把每个词进行翻转，然后再总体翻转。
         */
        if (str == null || str.trim().length() == 0){
            return str;
        }

        String[] strs = str.split(" ");

        StringBuffer sb = new StringBuffer();

        for(int i =strs.length-1;i>=0;i--){

            sb.append(strs[i]);

            if (i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "zhang san li si";

        System.out.println(Fanzhuan(str));
    }
}

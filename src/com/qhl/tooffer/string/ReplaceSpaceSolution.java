/**
 * @Author: LinK
 * @Date: 2019/4/17 17:12
 */

package com.qhl.tooffer.string;

import java.util.Arrays;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpaceSolution {
    public static String replaceSpace(StringBuffer str){

        StringBuffer newBuffer = new StringBuffer();
        char[] chars = str.toString().toCharArray();
        int start = 0;
        for(int i = 0;i<chars.length;i++){
            if (chars[i] == ' '){
                newBuffer.append(new String(Arrays.copyOfRange(chars,start,i)));
                newBuffer.append("%20");
                start =i+1;
            }
        }
        newBuffer.append(new String(Arrays.copyOfRange(chars,start,chars.length)));

        return newBuffer.toString();
    }

}

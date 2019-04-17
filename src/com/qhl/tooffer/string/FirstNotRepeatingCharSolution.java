/**
 * @Author: LinK
 * @Date: 2019/4/17 17:01
 */

package com.qhl.tooffer.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class FirstNotRepeatingCharSolution {
    /**
     * 思路：遍历String，用hashMap存储character所出现的次数即可
     * @param string
     * @return
     */
    public static int FirstNotRepeatingChar(String string){
        Map<Character,Integer> map = new HashMap<>();

        for (Character character:string.toCharArray()){
            map.put(character,map.containsKey(character)?map.get(character)+1:1);
        }

        for(int i =0;i<string.toCharArray().length;i++){
            if (map.get(string.toCharArray()[i]) ==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "ababcba";

        System.out.println(FirstNotRepeatingChar(str));
    }
}

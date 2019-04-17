/**
 * @Author: LinK
 * @Date: 2019/4/17 15:49
 */

package com.qhl.tooffer.basestructure;

public class StackTest {
    public static void main(String[] args) {

        StringStack2 stringStack = new StringStack2();

        for (int i =0;i<100;i++){
            stringStack.push("abc");
        }
        stringStack.push("df");
        System.out.println(stringStack.pop());
        stringStack.pop();
    }
}

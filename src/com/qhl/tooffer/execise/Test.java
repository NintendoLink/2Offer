/**
 * @Author: LinK
 * @Date: 2019/4/18 16:52
 */

package com.qhl.tooffer.execise;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());


    }
}

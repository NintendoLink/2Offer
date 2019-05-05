/**
 * @Author: LinK
 * @Date: 2019/4/18 14:22
 */

package com.qhl.tooffer.listnode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHeadSolution {

    /**
     * 思路;
     * 1、递归算法
     * 2、非递归算法
     */
    static ArrayList<Integer>  arr = new ArrayList<>();
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
            if (listNode != null){
                printListFromTailToHead(listNode.next);
                arr.add(listNode.val);
            }
            return arr;

            //利用栈
//        if (listNode ==null){
//            return new ArrayList<>();
//        }
//
//        Stack<Integer> stack = new Stack<>();
//
//
//        while(listNode!=null){
//            stack.push(listNode.val);
//            listNode = listNode.next;
//        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        while (!stack.isEmpty()){
//            arrayList.add(stack.pop());
//        }
//        return arrayList;


    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        System.out.println(printListFromTailToHead(listNode1));
        System.out.println(listNode1.next.val);

    }
}

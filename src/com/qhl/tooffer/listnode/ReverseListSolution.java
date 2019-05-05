/**
 * @Author: LinK
 * @Date: 2019/5/5 11:23
 */

package com.qhl.tooffer.listnode;

public class ReverseListSolution {

    public static ListNode solution(ListNode head){

        if (head == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;

        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;

    }
}

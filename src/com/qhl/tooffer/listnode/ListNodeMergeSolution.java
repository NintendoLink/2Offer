/**
 * @Author: LinK
 * @Date: 2019/4/17 14:12
 */

package com.qhl.tooffer.listnode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class ListNodeMergeSolution {

    public static ListNode Solution(ListNode list1,ListNode list2){
        /**
         * 思路
         * 两个指针分别指向两个链表
         */
        if (list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        ListNode res  = new ListNode(0);
        ListNode mergeListNode = res;

        while (list1!= null && list2!=null){
            if (list1.val <= list2.val){
                mergeListNode.next = list1;
                mergeListNode = mergeListNode.next;
                list1 = list1.next;
            }else {
                mergeListNode.next = list2;
                mergeListNode = mergeListNode.next;
                list2 = list2.next;
            }

            if (list1 == null){
                mergeListNode.next = list2;
            }

            if (list2 == null){
                mergeListNode.next = list1;
            }

        }
        return res.next;
    }
}

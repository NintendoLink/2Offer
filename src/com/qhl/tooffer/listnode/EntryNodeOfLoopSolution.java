/**
 * @Author: LinK
 * @Date: 2019/5/5 15:12
 */

package com.qhl.tooffer.listnode;

/**
 * 链表中环的入口节点
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class EntryNodeOfLoopSolution {

    /**
     * 思路：
     * 第一步，找环中相汇点。分别用p1，p2指向链表头部，
     * p1每次走一步，p2每次走二步，直到p1==p2找到在环中的相汇点。
     * 要注意程序的健壮性和设计结构的问题
     * @param pHead
     * @return
     */
    public static ListNode solution(ListNode pHead){

        if (pHead == null || pHead.next==null){
            return null;
        }

        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast!=null && fast.next!=null){

                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast){
                    slow = pHead;
                    while (slow!=fast){
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return slow;
                }
        }
        return null;
    }
}

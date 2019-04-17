/**
 * @Author: LinK
 * @Date: 2019/4/17 16:29
 */

package com.qhl.tooffer.listnode;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNodeSolution {

    public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){

        /**
         * 思路：
         * 1、如果两个链表有公共节点，那么遍历到最后，两个链表的指针指向的一定是同一个节点
         * 2、在遍历完一遍之后，两个链表的长度不一定相同，找到较长的那个，并求出两个链表的长度之差。
         * 3、较长的链表先走 长度之差 的长度
         * 4、然后较短的链表也开始走，直到两个指针指向同一个节点为止
         */
        if (pHead1 ==null || pHead2 == null){
            return null;
        }
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;

        int count = 0;

        while(cur1.next!=null){
            cur1 = cur1.next;
            count ++;
        }

        while (cur2.next!=null){
            cur2 = cur2.next;
            count--;
        }
        if (cur1 != cur2){
            return null;
        }

        cur1 = count>0? pHead1:pHead2;
        cur2 = cur1==pHead1? pHead2:pHead1;

        count = Math.abs(count);

        while(count>0){
            cur1 = cur1.next;
            count--;
        }

        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return cur1;
    }
}

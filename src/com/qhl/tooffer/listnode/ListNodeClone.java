/**
 * @Author: LinK
 * @Date: 2019/5/5 14:54
 */

package com.qhl.tooffer.listnode;

import java.util.HashMap;
import java.util.Map;

/**
 * 单链表的复制
 */
public class ListNodeClone {

    public static ListNode solution(ListNode pHead){
            ListNode current = null;
            ListNode pre = null;

            while (pHead!=null){

                current = new ListNode(pHead.val);
                pre = current;
                current = current.next;
                pre.next = current;
                pHead = pHead.next;
            }

            return current;
//        Map<ListNode,ListNode> map = new HashMap<>();
//
//        ListNode current = pHead;
//        while (current!=null){
//            map.put(current,new ListNode(current.val));
//            current = current.next;
//        }
//
//        current = pHead;
//        while (current!=null){
//            map.get(current).next = map.get(current.next);
//            current = current.next;
//        }
//
//        return map.get(pHead);
    }


    public static void main(String[] args) {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


//        while (node1!=null){
//            System.out.println(node1.val);
//            node1 = node1.next;
//        }

        ListNode cloneNode = solution(node1);

        while (cloneNode!=null){
            System.out.println(cloneNode.val);
            cloneNode = cloneNode.next;
        }
    }
}

/**
 * @Author: LinK
 * @Date: 2019/5/5 15:30
 */

package com.qhl.tooffer.listnode;

public class DeleteDuplicationSulution {

    public static ListNode solution(ListNode pHead){

        if (pHead == null){
            return null;
        }

        //思路1
        ListNode firstNode = new ListNode(-1);
        firstNode.next = pHead;
        ListNode p = pHead;
        // 指向前一个节点
        ListNode preNode = firstNode;
        while (p!=null &&p.next !=null) {//注意条件的顺序，否则不对 因为如果p为null，p.next肯定异常
            if(p.val == p.next.val) {
                int val = p.val;
                // 向后重复查找
                while (p != null&&p.val == val) {
                    p = p.next;
                }
                // 上个非重复值指向下一个非重复值：即删除重复值
                preNode.next = p;
            }
            else {
                // 如果当前节点和下一个节点值不等，则向后移动一位
                preNode = p;
                p = p.next;
            }
        }
        return firstNode.next;


//        思路2：自己的解法
//        ListNode helpNode = new ListNode(0);
//        helpNode.next = pHead;
//        ListNode current = helpNode;
//
//        while (current.next!=null && current.next.next!=null){
//
//            if (current.next.val == current.next.next.val){
//                ListNode activateNode = current.next;
//                while(activateNode.val == activateNode.next.val){
//                    activateNode = activateNode.next;
//                }
//                current.next = activateNode.next;
//                continue;
//            }
//
//            current = current.next;
//        }
//
//        return helpNode.next;
    }

    public static void main(String[] args) {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(1);
        ListNode node3= new ListNode(1);
        ListNode node4= new ListNode(4);
        ListNode node5= new ListNode(4);
        ListNode node6= new ListNode(7);
        ListNode node7= new ListNode(5);
        ListNode node8= new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

//        while (node1!=null){
//            System.out.println(node1.val);
//            node1 = node1.next;
//        }

        ListNode pHead = solution(node1);

        while (pHead!=null){
            System.out.println(pHead.val);
            pHead = pHead.next;
        }
    }
}

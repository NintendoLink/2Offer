/**
 * @Author: LinK
 * @Date: 2019/4/16 14:57
 */

package com.qhl.tooffer.listnode;


public class FindkthToTailSolution {


    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param head
     * @param k
     * @return
     */
    public ListNode findkthToTail(ListNode head, int k){

        if (head == null || k <=0){
            return null;
        }

        /**
         * 两种思路
         * 1、遍历链表，求出链表的长度n，然后，遍历链表到n-k
         * 2、设置两个指针，一个指向head，一个只想head------>>>>>>>headn,然后开始遍历
         */

////        思路1
//        ListNode node = head;
//        int count = 0;
//        while (node!=null){
//            count ++;
//            node = node.next;
//        }
//        ListNode node1 = head;
//        for (int i =0 ;i< count;i++){
//            node1 = node1.next;
//        }
//        return  node1;

//        思路2

        ListNode slowNode = head;
        ListNode fastNode = head;

        for(int i = 0;i<k;i++){

            if (fastNode ==null){
                return null;
            }
            fastNode = fastNode.next;
        }

        while (fastNode !=null){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}

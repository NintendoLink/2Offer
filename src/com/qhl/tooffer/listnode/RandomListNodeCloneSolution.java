/**
 * @Author: LinK
 * @Date: 2019/5/5 11:34
 */

package com.qhl.tooffer.listnode;

import java.util.HashMap;
import java.util.Map;

/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class RandomListNodeCloneSolution {

    /**
     * 算法步骤：遍历两遍链表，第一遍将仅仅将数赋值给map中的值，第二遍将指针指向赋值。注意保存头指针的位置。
     * 1.第一遍遍历，key是第一个链表中的节点，value是复制后的链表节点，但是指针都指向null。
     * 2.第二遍遍历，将相对应的next和random均复制。
     * @param pHead
     * @return
     */
    public static RandomListNode solution(RandomListNode pHead){

        if (pHead ==null){
            return null;
        }

        RandomListNode current = pHead;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();

        while (current!=null){
            map.put(current,new RandomListNode(current.label));
            current = current.next;
        }

        current = pHead;

        //关键步骤
        while (current!=null){
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }

        return map.get(pHead);
    }

    public static void main(String[] args) {
        RandomListNode list1 = new RandomListNode(1);
        RandomListNode list2 = new RandomListNode(2);
        RandomListNode list3 = new RandomListNode(3);
        RandomListNode list4 = new RandomListNode(4);

        list1.next = list2;
        list2.next = list3;
        list3.next = list4;

        RandomListNode pHead = list1;
        RandomListNode cloneList = solution(pHead);

        while (cloneList!=null){
            System.out.println(cloneList.label);
            cloneList = cloneList.next;
        }
    }
}

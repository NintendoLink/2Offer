/**
 * @Author: LinK
 * @Date: 2019/4/30 10:19
 */

package com.qhl.tooffer.tree;

/**
 * 二叉树的下一个节点
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class GetNextNodeSolution {

    /**
     * 思路
     * 首先判断该节点有没有右子树，如果有的话，则下一个节点在右子树最左边的节点
     * 没有右子树的情况下：
     * 判断此节点是不是父节点的左孩子，如果是的话，则下一个节点必定是父节点；（如果是父节点的右孩子，则父节点已经在此节点之前遍历过）
     *
     * 在此节点没有右子树并且为父节点的右孩子节点的情况下，此节点必定是以此节点为跟的子树中序遍历的最后一个节点，在整棵树的中序遍历下
     * 只能往上去找下一个节点
     *
     * 循环遍历父节点即可。
     * @param pNode
     * @return
     */
    public static TreeNode solution(TreeNode pNode){

        if (pNode == null){
            return null;
        }

        if (pNode.right != null){

            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }

        while (pNode.next!=null){

            if (pNode.next.left == pNode){
                return pNode.next;
            }

            pNode = pNode.next;
        }

        return null;
    }
}

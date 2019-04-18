/**
 * @Author: LinK
 * @Date: 2019/4/18 16:38
 */

package com.qhl.tooffer.tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 */
public class PrintFromTopToBottomSolution {

    /**
     * 算法思路，（剑指offer图片）
     * 1.根节点放到队列里面，队列不空，就打印队列头，打印这个节点，马上把这个节点的左右子节点放到队列中。
     * 2.再要访问一个节点，把这个节点的左右放入，此时队头是同层的，对位是打印出来的左右。依次先入先出就可以得到结果。
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> layerList = new ArrayList<Integer>();
        if (root == null)
            return layerList;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            layerList.add(node.val);
            if (node.left != null)
                queue.addLast(node.left);
            if (node.right != null)
                queue.addLast(node.right);
        }
        return layerList;

    }
}

/**
 * @Author: LinK
 * @Date: 2019/4/17 14:52
 */

package com.qhl.tooffer.tree;

public class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    //父节点
    TreeNode next = null;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {
    }
}

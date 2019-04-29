/**
 * @Author: LinK
 * @Date: 2019/4/29 15:18
 */

package com.qhl.tooffer.tree;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树，描述：如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class IsBalanceSolution {

    /**
     * 思路
     * 1、分别求出左子树与右子树的深度，比较即可
     * 2、从底向上判断，这样可以记录下一层的深度
     * @param root
     * @return
     */
    public static boolean solution(TreeNode root){

//        思路一
        return lengthOfTree(root.left) - lengthOfTree(root.right) > 1;
    }

    public static int lengthOfTree(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = lengthOfTree(root.left);
        int right = lengthOfTree(root.right);

        return left > right ? left +1: right+1;
    }
}

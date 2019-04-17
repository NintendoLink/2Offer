/**
 * @Author: LinK
 * @Date: 2019/4/17 14:53
 */

package com.qhl.tooffer.tree;

import com.qhl.tooffer.basestructure.Stack;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class TreeReverseSolution {

    /**
     *
     * @param root
     */
    public static void Mirror(TreeNode root){
        /**
         * 思路
         * 1、递归算法
         * 2、利用栈的层序遍历。
         */
//        递归算法

//        if (root == null){
//            return ;
//        }
//        if (root.left!=null || root.right!= null){
//            TreeNode temp = root.right;
//            root.right = root.left;
//            root.left = temp;
//            Mirror(root.left);
//            Mirror(root.right);
//        }


//        利用栈的非递归算法
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            if (node.left!=null || node.right!= null){
                TreeNode temp = root.right;
                root.right = root.left;
                root.left= temp;
            }
            if (node.left!=null){
                stack.push(node.left);
            }

            if (node.right!=null){
                stack.push(node.right);
            }
        }
    }
}

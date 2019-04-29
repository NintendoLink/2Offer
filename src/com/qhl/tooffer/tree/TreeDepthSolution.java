/**
 * @Author: LinK
 * @Date: 2019/4/29 14:58
 */

package com.qhl.tooffer.tree;

/**
 * 二叉树的深度，从根节点(包括)到叶子节点(包括)所经过的层数
 */
public class TreeDepthSolution {


    /**
     * 典型的递归
     * 思路：
     * 根节点的深度 = 左子树/右子树的 深度+1
     * 空几点的深度为0
     * @param root
     * @return
     */
    public static int solution(TreeNode root){

        if (root == null){
            return 0;
        }

        int left = solution(root.left);
        int right = solution(root.right);

        return left >right? left+1:right+1;
    }
}

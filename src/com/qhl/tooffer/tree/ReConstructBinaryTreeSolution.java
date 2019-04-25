/**
 * @Author: LinK
 * @Date: 2019/4/18 16:18
 */

package com.qhl.tooffer.tree;

import java.util.Arrays;

public class ReConstructBinaryTreeSolution {

    /**
     * 前序{1,2,4,7,3,5,6,8}，中序{4,7,2,1,5,3,8,6}
     * 思路
     * 1、利用递归算法
     * 2、在前序序列中，第一个数字总是树的根节点；但是在中序遍历中，根节点在序列中间，左子树在根节点的左边，右子树在根节点的右边，因此需要遍历中序序列，
     * 3、先根据前序遍历创建第一个根节点，然后分局中序遍历分别确定左子树和右子树的根节点。
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre,int[] in){

        if (pre == null || in == null
                || pre.length ==0 || in.length ==0||
                pre.length != in.length){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);

        for(int i =0;i<in.length;i++){
            if (pre[0] == in[i]){
//                根据中序遍历确定左子树与右子树的根节点
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }

}


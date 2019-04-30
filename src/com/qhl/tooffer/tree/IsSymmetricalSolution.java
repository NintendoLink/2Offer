/**
 * @Author: LinK
 * @Date: 2019/4/30 11:04
 */

package com.qhl.tooffer.tree;

/**
 * 对称的二叉树
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 */
public class IsSymmetricalSolution {

    public static boolean solution(TreeNode pRoot){
        if (pRoot == null){
            return true;
        }

        //自己代码
//        return isCommon(pRoot);
        return isCommon(pRoot.left,pRoot.right);
    }


    //自己代码,逻辑错误，功能是实现左右节点的值都相同 ，但并不等同于对称二叉树
    private static boolean isCommon(TreeNode root){

        if (root.left == null && root.right ==null){
            return true;
        }

        return (root.left!= null && root.right!=null)&&
                (root.left.val == root.right.val) &&
                (isCommon(root.left)) &&
                (isCommon(root.right));
    }

    private static boolean isCommon(TreeNode left,TreeNode right){
        if (left == null && right ==null){
            return true;
        }

        if (left !=null && right != null){
            return  (left.val == right.val)&&
                    (isCommon(left.left,right.right))&&
                    isCommon(left.right,right.left);
        }
        return false;
    }


}

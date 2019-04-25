/**
 * @Author: LinK
 * @Date: 2019/4/25 15:36
 */

package com.qhl.tooffer.tree;

/**
 * 判断root2是否是root1的子树
 */
public class HasSubtreeSolution {
    public static boolean solution(TreeNode root1,TreeNode root2){
        boolean res = false;

        if (root1 !=null && root2!=null){
            if (root1.val == root2.val){
                res = doesTree1HasTree2(root1,root2);
            }
            if (!res){
                res = solution(root1.left,root2);
            }

            if (!res){
                res = solution(root1.right,root2);
            }

        }
        return res;
    }

    public static boolean doesTree1HasTree2(TreeNode root1,TreeNode root2){

        if (root2 ==null){
            return true;
        }
        if (root1 ==null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }
        return doesTree1HasTree2(root1.left,root2.left) && doesTree1HasTree2(root1.right,root2.right);
    }
}

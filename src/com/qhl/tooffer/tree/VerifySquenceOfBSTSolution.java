/**
 * @Author: LinK
 * @Date: 2019/4/29 14:18
 */

package com.qhl.tooffer.tree;

import java.util.Arrays;

/**
 * 二叉搜素树的后序遍历序列
 */
public class VerifySquenceOfBSTSolution {

    /**二叉搜索树的性质：
     * 所有左子树的节点小于根节点，所有右子树的节点值大于根节点的值。
     * 算法步骤：
     * 1.后序遍历的最后一个值为root，在前面的数组中找到第一个大于root值的位置。
     * 2.这个位置的前面是root的左子树，右边是右子树。然后左右子树分别进行这个递归操作。
     * 3.其中，如果右边子树中有比root值小的直接返回false
     * @param sequence
     * @return
     */
    public static boolean solution(int[] sequence){

//        写法一
//        if (sequence == null || sequence.length ==0){
//            return false;
//        }
//        if (sequence.length == 1){
//            return true;
//        }
//
//        int length = sequence.length;
//        int root = sequence[length-1];
//
//        int count = 0;
//        for (int i =0;i < sequence.length;i++,count++){
//            if (sequence[i] >root){
//                break;
//            }
//        }
//
//        for (int j = count;j<sequence.length;j++){
//            if (sequence[j] <root){
//                return false;
//            }
//        }
//        return solution(Arrays.copyOfRange(sequence,0,count)) && solution(Arrays.copyOfRange(sequence,count,length-1)) ;


        //写法2
        if (sequence ==null || sequence.length ==0){
            return false;
        }

        return isBST(sequence,0,sequence.length-1);
    }

    public static boolean isBST(int[] sequence,int start,int end){

        if (start >= end){
            return true;
        }

        int index = start;
        for (;index<end;index++){
            if (sequence[index] > sequence[end]){
                break;
            }
        }
        for (int i = index;i<end;i++){
            if (sequence[i] <sequence[end]){
                return false;
            }
        }

        return isBST(sequence,start,index-1) && isBST(sequence,index,end-1);
    }
    public static void main(String[] args) {
        int[] array = {1,4,3,6,8,7,5};

        System.out.println(solution(array));
    }
}

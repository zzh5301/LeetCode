package leetcode.binaryTree;

import java.util.Stack;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {
    //迭代
    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null)
            return 0;
        int sum=0;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left!=null){
                if(node.left.left==null&&node.left.right==null)
                    sum+=node.left.val;
                else{
                    stack.push(node.left);
                }
            }
            if(node.right!=null){
                if(node.right.left!=null||node.right.right!=null)
                    stack.push(node.right);
            }
        }

        return sum;


    }

    /*递归
     public int sumOfLeftLeaves(TreeNode root) {

        if(root==null)
            return 0;
        int sum=0;
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null)
                sum+=root.left.val;
            else{
                sum+=sumOfLeftLeaves(root.left);
            }
        }


        sum+=sumOfLeftLeaves(root.right);

        return sum;


    }
     */

}

package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/4.
 */
/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 */
public class BalancedBinaryTree {

    /*
    solution 1
     */
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return help(root)!=-1;
    }

    public int help(TreeNode root){
        if(root==null)
            return 0;
        int flag=0;
        int l=help(root.left);
        int r=help(root.right);
        if(l<0||r<0)
            flag=-1;
        if(Math.abs(l-r)>1)
            flag=-1;

        return (flag==-1)?-1:(Math.max(l,r)+1);

    }

    /*
    solution 2

    public int getHeight(TreeNode root){
        if(root==null) return 0;

        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean isBalance(TreeNode root){
        if(root==null)return true;

        int l=getHeight(root.left);
        int r=getHeight(root.right);

        return (!Math.abs(l-r)>1)&&isBalance(root.left)&&isBalance(root.right);
    }


     */


}

package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
 */
public class BinaryTreeMaximumPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;

        pathSum(root);
        return max;


    }

    public int pathSum(TreeNode root){
        if(root==null)
            return 0;

        int left=Math.max(0,pathSum(root.left));
        int right=Math.max(0,pathSum(root.right));

        int value=left+right+root.val;
        max=Math.max(max,value);

        return Math.max(left,right)+root.val;

    }
}

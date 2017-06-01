package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/1.
 */

/*
Given a binary tree, find its minimum depth.The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 */

public class DepthOfBinaryTree {
    public int run(TreeNode root) {
        if(root==null)
            return 0;

        if(root.left==null)
            return run(root.right)+1;
        if(root.right==null)
            return run(root.left)+1;

        return Math.min(run(root.left),run(root.right))+1;
    }
}

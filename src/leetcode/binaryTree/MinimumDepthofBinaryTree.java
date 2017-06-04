package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/4.
 */
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;

        int leftMin=minDepth(root.left);
        int rightMin=minDepth(root.right);

        return (leftMin==0||rightMin==0)?leftMin+rightMin+1:Math.min(leftMin,rightMin)+1;


    }

}

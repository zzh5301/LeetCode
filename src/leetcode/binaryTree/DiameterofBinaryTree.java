package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/1.
 */
/*

Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the
longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 */
public class DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null)
            return 0;
        int diameter_l=diameterOfBinaryTree(root.left);
        int diameter_r=diameterOfBinaryTree(root.right);

        int depth_l=maxDepth(root.left);
        int depth_r=maxDepth(root.right);

        int tem1=Math.max(diameter_l,diameter_r);
        int tem2=depth_l+depth_r;

        return (tem1>tem2)?tem1:tem2;

    }

    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);

        return ((l>r)?l:r)+1;
    }
}

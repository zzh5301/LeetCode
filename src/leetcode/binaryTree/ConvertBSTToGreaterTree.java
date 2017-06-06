package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
 */
public class ConvertBSTToGreaterTree {
    TreeNode pre=null;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return null;

        convertBST(root.right);
        if(pre!=null)
            root.val=root.val+pre.val;

        pre=root;
        convertBST(root.left);

        return root;

    }
}

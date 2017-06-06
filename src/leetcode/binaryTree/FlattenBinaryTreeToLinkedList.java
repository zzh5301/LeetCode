package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 */

public class FlattenBinaryTreeToLinkedList {
    TreeNode pre=null;
    public void flatten(TreeNode root) {
        if(root==null)
            return;

        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        root.left=null;
        pre=root;


    }
}

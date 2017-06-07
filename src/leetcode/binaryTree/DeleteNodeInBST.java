package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

Search for a node to remove.
If the node is found, delete the node.
Note: Time complexity should be O(height of tree).

Example:

root = [5,3,6,2,4,null,7]
key = 3

    5
   / \
  3   6
 / \   \
2   4   7

Given key to delete is 3. So we find the node with value 3 and delete it.

One valid answer is [5,4,6,2,null,null,7], shown in the following BST.

    5
   / \
  4   6
 /     \
2       7

Another valid answer is [5,2,6,null,4,null,7].

    5
   / \
  2   6
   \   \
    4   7
 */

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;

        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }else{
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;

            TreeNode min=findMin(root.right);
            root.val=min.val;
            root.right=deleteNode(root.right,min.val);
        }

        return root;

    }

    public TreeNode findMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}

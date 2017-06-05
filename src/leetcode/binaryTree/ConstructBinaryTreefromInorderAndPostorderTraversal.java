package leetcode.binaryTree;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||inorder.length==0)
            return null;

        int val=postorder[postorder.length-1];

        TreeNode root=new TreeNode(val);

        int index=getIndex(val,inorder);

        root.left=buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));

        root.right=buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));

        return root;



    }

    public int getIndex(int val,int[] inorder){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
}

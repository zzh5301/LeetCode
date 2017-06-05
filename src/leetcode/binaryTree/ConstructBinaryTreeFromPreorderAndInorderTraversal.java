package leetcode.binaryTree;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder==null||inorder==null||preorder.length==0||inorder.length==0)
            return null;

        int val=preorder[0];
        TreeNode root=new TreeNode(val);

        int index=getIndex(val,inorder);
        if(index!=-1){
            root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
            root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        }
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

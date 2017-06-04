package leetcode.binaryTree;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/6/4.
 */
/*
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).

Subscribe to see which companies asked this question.
 */
public class FindModeInBinarySearchTree {
    Integer pre=null;
    int count=1;
    int max=0;

    public int[] findMode(TreeNode root) {

        if(root==null)
            return new int[0];

        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        int[] a=new int[list.size()];
        for(int i=0;i<a.length;i++){
            a[i]=list.get(i);
        }


        return a;

    }
    public void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null)
            return ;
        inorder(root.left,list);
        if(pre!=null){
            if(root.val==pre)
                count++;
            else
                count=1;
        }
        if(count>max){
            max=count;
            list.clear();
            list.add(root.val);
        }else if(count==max){
            list.add(root.val);
        }
        pre=root.val;

        inorder(root.right,list);
    }

}

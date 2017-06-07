package leetcode.binaryTree;

import java.util.Stack;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Note:
A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree {
    public void recoverTree(TreeNode root) {
        if(root==null)
            return;

        TreeNode node1=null;
        TreeNode node2=null;

        Stack<TreeNode> stack=new Stack<>();

        TreeNode cur=root;

        TreeNode pre=null;
        while(cur!=null||!stack.isEmpty()){

            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            if(pre!=null){
                if(cur.val<pre.val){
                    if(node1==null){
                        node1=pre;
                        node2=cur;
                    }else{
                        node2=cur;
                    }
                }
            }
            pre=cur;
            cur=cur.right;
        }

        int tem=node1.val;
        node1.val=node2.val;
        node2.val=tem;

    }
}

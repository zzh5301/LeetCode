package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack=new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){

            TreeNode node=stack.pop();
            list.add(node.val);
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
                stack.push(node.left);
        }
        return list;

    }
}

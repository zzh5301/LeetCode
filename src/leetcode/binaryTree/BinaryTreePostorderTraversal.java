package leetcode.binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> list=new LinkedList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.addFirst(node.val);
            if(node.left!=null)
                stack.add(node.left);
            if(node.right!=null)
                stack.add(node.right);

        }

        return list;


    }
}

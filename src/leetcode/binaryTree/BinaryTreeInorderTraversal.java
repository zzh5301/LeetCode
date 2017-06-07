package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lenovo on 2017/6/7.
 */
public class BinaryTreeInorderTraversal {
    /*
    Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();

        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){

            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }

            cur=stack.pop();
            list.add(cur.val);
            cur=cur.right;
        }

        return list;

    }
}

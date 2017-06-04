package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 2017/6/4.
 */
/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode last=root;
        TreeNode nlast=root;
        TreeNode cur=null;
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            cur=q.poll();
            list.add(cur.val);
            if(cur.left!=null){
                q.add(cur.left);
                nlast=cur.left;
            }
            if(cur.right!=null){
                q.add(cur.right);
                nlast=cur.right;
            }
            if(cur==last){
                res.add(new ArrayList<Integer>(list));
                list.clear();
                last=nlast;
            }
        }


        return res;
    }
}

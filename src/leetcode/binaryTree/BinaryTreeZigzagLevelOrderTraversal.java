package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        q.add(root);
        boolean leftToright=true;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> list=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(leftToright){
                    list.add(node.val);
                }else{
                    list.addFirst(node.val);
                }
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            res.add(list);
            leftToright=!leftToright;

        }

        return res;
    }
}

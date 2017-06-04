package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 2017/6/4.
 */
/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();

        List<List<Integer>> res=new LinkedList<>();
        if(root==null)
            return res;
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                /*TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null);
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                */

                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                list.add(q.poll().val);


            }
            res.add(0,list);

        }
        return res;

    }
}

package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class PathSumII {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null)
            return res;
        ArrayList<Integer> list=new ArrayList<>();
        dfs(root,list,sum);
        return res;

    }

    public void dfs(TreeNode root,ArrayList<Integer> l,int sum){
        if(root==null)
            return ;
        ArrayList<Integer> list=new ArrayList<>(l);
        list.add(root.val);
        if(root.val==sum&&root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(list));
            return ;
        }
        dfs(root.left,list,sum-root.val);
        dfs(root.right,list,sum-root.val);

    }
}

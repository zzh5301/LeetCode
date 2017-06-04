package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/4.
 */

/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
    List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return res;
        String s=""+root.val;
        dfs(root,s);

        return res;
    }

    public void dfs(TreeNode root,String s){

        if(root.left==null&&root.right==null){
            res.add(s);
            return;
        }
        if(root.left!=null)
            dfs(root.left,s+"->"+root.left.val);
        if(root.right!=null)
            dfs(root.right,s+"->"+root.right.val);
    }
}

package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
Example 2:
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7
Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {

        int result=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(i==0)result=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);

            }
        }

        return result;

    }

    /*
    public int findBottomLeftValue(TreeNode root) {


        List<Integer> list=new ArrayList<>();
        findLeftValue(root,0,list);
        return list.get(list.size()-1);

    }

    public void findLeftValue(TreeNode root,int depth,List<Integer> list){
        if(root==null)
            return;

        if(list.size()==depth)
        {
            list.add(root.val);
        }
        findLeftValue(root.left,depth+1,list);
        findLeftValue(root.right,depth+1,list);

    }
    */
}

package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
You need to find the largest value in each row of a binary tree.

Example:
Input:

          1
         / \
        3   2
       / \   \
      5   3   9

Output: [1, 3, 9]
 */


public class FindLargestValueinEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        help(root,list,0);

        return list;

    }

    public void help(TreeNode root, List<Integer> res, int depth){
        if(root==null)
            return;
        if(res.size()==depth)
            res.add(root.val);
        else{
            res.set(depth,Math.max(res.get(depth),root.val));
        }
        help(root.left,res,depth+1);
        help(root.right,res,depth+1);

    }
}

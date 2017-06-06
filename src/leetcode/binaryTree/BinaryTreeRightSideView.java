package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        rightView(root,list,0);

        return list;


    }

    public void rightView(TreeNode curr,List<Integer> list,int depth){
        if(curr==null)
            return ;
        if(depth==list.size())
            list.add(curr.val);

        rightView(curr.right,list,depth+1);
        rightView(curr.left,list,depth+1);


    }
}

package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.

For example,
Given n = 3, your program should return all 5 unique BST's shown below.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if(n<1)
            return new ArrayList<TreeNode>();
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start, int end){

        List<TreeNode> list=new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        if(start==end){
            list.add(new TreeNode(start));
            return list;
        }

        for(int i=start;i<=end;i++){
            List<TreeNode> leftList= generateTrees(start,i-1);
            List<TreeNode> rightList= generateTrees(i+1,end);
            for(int j=0;j<leftList.size();j++)
                for(int k=0;k<rightList.size();k++){
                    TreeNode root=new TreeNode(i);
                    root.left=leftList.get(j);
                    root.right=rightList.get(k);
                    list.add(root);
                }
        }
        return list;

    }
}

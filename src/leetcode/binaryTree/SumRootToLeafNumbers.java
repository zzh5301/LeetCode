package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        return sumNumHelp(root,0);
    }

    public int sumNumHelp(TreeNode root,int sum){
        if(root==null)
            return 0;
        sum=(sum*10+root.val);
        if(root.left==null&&root.right==null)
            return sum;
        int leftSum=sumNumHelp(root.left,sum);
        int rightSum=sumNumHelp(root.right,sum);

        return leftSum+rightSum;
    }
}

package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

Example 1:
     3
    / \
   2   3
    \   \
     3   1
Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
Example 2:
     3
    / \
   4   5
  / \   \
 1   3   1
Maximum amount of money the thief can rob = 4 + 5 = 9.
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        return robhelp(root)[1];

    }

    public int[] robhelp(TreeNode root){
        int[] res=new int[2];//res[0]表示不选择root点， res[1] 选择root点与不选root比较后的结果
        if(root==null)
            return res;

        int[] l=robhelp(root.left);
        int[] r=robhelp(root.right);

        res[0]=l[1]+r[1];
        res[1]=Math.max(res[0],l[0]+r[0]+root.val);

        return res;

    }
}

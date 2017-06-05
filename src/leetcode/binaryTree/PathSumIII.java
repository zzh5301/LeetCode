package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 */
public class PathSumIII {
    int count=0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        dfs(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);

        return count;

    }

    public void dfs(TreeNode root,int sum){
        if(root==null)
            return;
        if(root.val==sum){
            count++;
        }
        sum=sum-root.val;
        dfs(root.left,sum);
        dfs(root.right,sum);

    }
}

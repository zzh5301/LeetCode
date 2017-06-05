package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/5.
 */
/*
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        /*
        if(n<1)
            return 0;
        if(n==1)
            return 1;
        int sum=0;
        for(int i=1;i<=n;i++){
            int l=numTrees(i-1);
            int r=numTrees(n-i);

            sum+=(l==0||r==0)?(r+l):l*r;
        }
        return sum;
        */
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];

    }
}

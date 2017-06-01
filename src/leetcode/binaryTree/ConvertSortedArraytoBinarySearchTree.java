package leetcode.binaryTree;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/6/1.
 */

/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums==null||nums.length==0)
            return null;
        int l=0;
        int r=nums.length-1;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));

        return root;
    }
}

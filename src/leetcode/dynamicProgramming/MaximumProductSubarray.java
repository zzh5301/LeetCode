package leetcode.dynamicProgramming;

/**
 * Created by lenovo on 2017/6/9.
 */
/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 */

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        int res=nums[0];
        for(int i=1,min=nums[0],max=nums[0];i<nums.length;i++){
            if(nums[i]<0){
                min=min^max;
                max=min^max;
                min=min^max;
            }
            min=Math.min(nums[i],min*nums[i]);
            max=Math.max(nums[i],max*nums[i]);

            res=Math.max(max,res);
        }
        return res;

    }
}

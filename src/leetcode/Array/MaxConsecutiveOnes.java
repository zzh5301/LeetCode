package leetcode.Array;

/**
 * Created by lenovo on 2017/6/22.
 */
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max=-1;
        int count=0;
        int i=0;
        while(i<nums.length){

            while(i<nums.length&&nums[i]==1){
                count++;
                i++;
            }
            max=Math.max(count,max);
            count=0;
            i++;
        }
        return max;

    }
}

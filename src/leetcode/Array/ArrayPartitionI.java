package leetcode.Array;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/6/23.
 */
/*

 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {

        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;

    }
}

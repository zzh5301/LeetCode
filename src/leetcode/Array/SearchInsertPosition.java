package leetcode.Array;

/**
 * Created by lenovo on 2017/6/23.
 */
/*

 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;
        if(nums[j]<target)
            return j+1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return i;

    }
}

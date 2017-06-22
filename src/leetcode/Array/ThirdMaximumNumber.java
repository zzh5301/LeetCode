package leetcode.Array;

/**
 * Created by lenovo on 2017/6/22.
 */
/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int tem=nums[i]+1;// +1用于应对输入数据中有值等于Integer.MIN_VALUE
            if(tem==first||tem==second||tem==third)continue;
            if(first<tem){
                first=first^tem;
                tem=first^tem;
                first=first^tem;
            }
            if(second<tem){
                second=second^tem;
                tem=second^tem;
                second=second^tem;
            }

            if(third<tem)
                third=tem;
        }
        if(third==Integer.MIN_VALUE||third==second)
            return first-1;
        else
            return third-1;

    }
}

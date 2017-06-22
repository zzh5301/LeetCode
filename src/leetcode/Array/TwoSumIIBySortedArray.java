package leetcode.Array;

/**
 * Created by lenovo on 2017/6/22.
 */
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

        The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

        You may assume that each input would have exactly one solution and you may not use the same element twice.

        Input: numbers={2, 7, 11, 15}, target=9
        Output: index1=1, index2=2

*/
public class TwoSumIIBySortedArray {
    public int[] twoSum(int[] numbers, int target) {

        int[] res=new int[2];

        for(int k=0;k<numbers.length-1;k++){

            int i=k+1;
            int num1=numbers[k];

            int j=numbers.length-1;
            while(i<=j){
                int mid=i+(j-i)/2;

                if(num1+numbers[mid]==target){
                    res[0]=(k+1);
                    res[1]=(mid+1);
                    return res;
                }else if(num1+numbers[mid]>target){
                    j=mid-1;

                }else{
                    i=mid+1;
                }
            }
        }

        return res;

    }
}

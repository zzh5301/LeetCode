package leetcode.Array;

/**
 * Created by lenovo on 2017/6/23.
 */
/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */


public class RotateArray {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        if(k==n)return;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse(int[] a,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }

    }
}

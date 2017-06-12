package leetcode.String;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/6/12.
 */
/*
Given a positive 32-bit integer n, you need to find the smallest 32-bit integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive 32-bit integer exists, you need to return -1.

Example 1:
Input: 12
Output: 21
Example 2:
Input: 21
Output: -1
 */
public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {

        char[] arr=(n+"").toCharArray();

        int i=arr.length-1;
        int j=arr.length-1;
        for(;i>0;i--){
            if(arr[i-1]<arr[i])
                break;
        }
        if(i==0)
            return -1;
        for(;j>=i;j--){
            if(arr[j]>arr[i-1])
            {
                char c=arr[j];
                arr[j]=arr[i-1];
                arr[i-1]=c;
                break;
            }

        }

        Arrays.sort(arr,i,arr.length);
        long res=Long.parseLong(new String(arr));
        return (res<=Integer.MAX_VALUE)?(int)res:-1;

    }
}

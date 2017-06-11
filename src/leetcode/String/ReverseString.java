package leetcode.String;

/**
 * Created by lenovo on 2017/6/11.
 */
/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {

        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){

            char tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;

            i++;
            j--;

        }
        return String.valueOf(arr);

    }
}

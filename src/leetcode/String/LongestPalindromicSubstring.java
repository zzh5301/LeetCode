package leetcode.String;

/**
 * Created by lenovo on 2017/6/11.
 */

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        int len = s.length();
        if (len < 2)
            return s;
        int max=0;
        int ls=0;
        int le=0;
        char[] c=s.toCharArray();

        for(int i=0;i<c.length;i++){
            if(isPalindrome(c,i-max-1,i)){
                ls=i-max-1;
                le=i;
                max+=2;
            }else if(isPalindrome(c,i-max,i)){
                ls=i-max;
                le=i;
                max+=1;
            }

        }

        return s.substring(ls,le+1);

    }

    public boolean isPalindrome(char[] c,int s,int e){
        if(s<0)
            return false;

        while(s<e){
            if(c[s++]!=c[e--])
                return false;
        }
        return true;
    }
}

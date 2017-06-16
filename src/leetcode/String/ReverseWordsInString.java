package leetcode.String;

/**
 * Created by lenovo on 2017/6/16.
 */
/*
Total Accepted: 155905
Total Submissions: 992206
Difficulty: Medium
Contributor: LeetCode
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        if(s==null||s.length()==0||s.equals(" "))
            return "";

        char[] arr=s.toCharArray();
        reverse(arr,0,s.length()-1);

        reverseWords(arr,s.length());



        return replaceSpace(arr,s.length());

    }
    public void reverseWords(char[] c,int n){

        int i=0;
        int j=0;
        while(i<n){
            while(i<j||(i<n&&c[i]==' '))i++;
            while(j<i||(j<n&&c[j]!=' '))j++;
            reverse(c,i,j-1);
        }
    }

    public String replaceSpace(char[] c,int n){
        int i=0;
        int j=0;
        while(j<n){
            while(j<n&&c[j]==' ')j++;
            while(j<n&&c[j]!=' ')c[i++]=c[j++];
            while(j<n&&c[j]==' ')j++;
            if(j<n)c[i++]=' ';

        }

        return String.valueOf(c).substring(0,i);

    }

    public void reverse(char[] c,int i,int j){

        while(i<j){
            char t=c[i];
            c[i++]=c[j];
            c[j--]=t;
        }
    }
}

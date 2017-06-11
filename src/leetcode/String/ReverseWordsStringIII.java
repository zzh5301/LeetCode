package leetcode.String;

/**
 * Created by lenovo on 2017/6/11.
 */
/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsStringIII {
    public String reverseWords(String s) {

        String[] strs=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.length-1;i++){
            strs[i]=reverString(strs[i]);
            sb.append(strs[i]).append(" ");

        }
        sb.append(reverString(strs[strs.length-1]));

        return sb.toString();


    }

    public String reverString(String str){

        int i=0;
        int j=str.length()-1;
        char[] c=str.toCharArray();
        while(i<j){

            char tem=c[i];
            c[i]=c[j];
            c[j]=tem;
            i++;
            j--;
        }

        return String.valueOf(c);

    }
}

package leetcode.String;

/**
 * Created by lenovo on 2017/6/11.
 */
/*
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 */
public class CountAndSay {
    public String countAndSay(int n) {


        String pre="1";


        for(int i=1;i<n;i++){

            String cur="";

            int count=1;
            int j=1;
            for(;j<pre.length();j++){
                if(pre.charAt(j)==pre.charAt(j-1)){
                    count++;
                }else{
                    cur+=(count+String.valueOf(pre.charAt(j-1)));
                    count=1;
                }

            }
            cur+=(count+String.valueOf(pre.charAt(j-1)));
            pre=cur;

        }

        return pre;

    }
}

package leetcode.String;

/**
 * Created by lenovo on 2017/6/13.
 */

/*
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
public class DecodeWays {

    public int numDecodings(String s) {

        if(s==null||s.length()==0||s.charAt(0)=='0')
            return 0;

        int[] dp=new int[s.length()+1];
        dp[0]=1;
        dp[1]=(s.charAt(0)!='0')?1:0;

        for(int i=2;i<=s.length();i++){
            String sub=s.substring(i-2,i);
            int tem=Integer.parseInt(sub);
            if(sub.charAt(1)-'0'>=1)
                dp[i]+=dp[i-1];
            if(tem>=10&&tem<=26)
                dp[i]+=dp[i-2];
        }
        return dp[s.length()];

    }


}

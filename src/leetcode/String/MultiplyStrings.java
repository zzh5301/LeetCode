package leetcode.String;

/**
 * Created by lenovo on 2017/6/12.
 */
/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

Note:

The length of both num1 and num2 is < 110.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {

        int len1=num1.length();
        int len2=num2.length();

        StringBuilder sb=new StringBuilder();

        int[] pos=new int[len1+len2];

        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){

                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1=i+j;
                int p2=i+j+1;
                int sum=mul+pos[p2];
                pos[p2]=sum%10;
                pos[p1]+=sum/10;
            }
        }

        for(int i=0;i<pos.length;i++){

            if(sb.length()==0&&pos[i]==0)
                continue;
            sb.append(pos[i]);
        }

        return (sb.length()==0)?"0":sb.toString();


    }
}

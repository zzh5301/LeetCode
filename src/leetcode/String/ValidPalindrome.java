package leetcode.String;

/**
 * Created by lenovo on 2017/6/11.
 */
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0)return true;


        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            while(i<j&&!isletter(s.charAt(i)))i++;
            while(i<j&&!isletter(s.charAt(j)))j--;
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public boolean isletter(char c){

        return Character.isLetterOrDigit(c);

    }
}

package leetcode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/13.
 */
/*
Total Accepted: 148514
Total Submissions: 437859
Difficulty: Medium
Contributor: LeetCode
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinationsPhoneNumber {
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0)
            return res;

        String[] ans=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backTrace(0,"",digits,ans);
        return res;

    }

    public void backTrace(int n,String str,String digit,String[] ans){
        if(n==digit.length())
        {
            res.add(str);
            return;
        }
        String s=ans[digit.charAt(n)-'0'];
        for(int i=0;i<s.length();i++){
            String newStr=str+s.charAt(i);
            backTrace(n+1,newStr,digit,ans);

        }

    }
}

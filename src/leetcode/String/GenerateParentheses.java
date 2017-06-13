package leetcode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/13.
 */
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class GenerateParentheses {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        String[] parenthese=new String[]{"(",")"};
        backTrace(0,0,"",n,parenthese);
        return res;
    }

    public void backTrace(int left,int right,String str,int n,String[] parenthese){
        if(left<right||left>n){
            return;
        }
        if((left+right)==2*n){
            res.add(str);
            return;
        }
        for(int i=0;i<parenthese.length;i++){

            String newStr=str+parenthese[i];
            if(parenthese[i].equals("("))
                backTrace(left+1,right,newStr,n,parenthese);
            else
                backTrace(left,right+1,newStr,n,parenthese);

        }
    }
}

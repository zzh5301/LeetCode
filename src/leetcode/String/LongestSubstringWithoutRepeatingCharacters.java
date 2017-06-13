package leetcode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/6/13.
 */
/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

Subscribe to see which companies asked this question.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;

        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                j=Math.max(j,map.get(c)+1);
            }
            map.put(c,i);
            max=Math.max(max,i-j+1);

        }
        return max;


    }
}

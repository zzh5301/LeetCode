package leetcode.String;

import java.util.*;

/**
 * Created by lenovo on 2017/6/12.
 */
/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            if(map.get(key)==null){
                ArrayList<String> list=new ArrayList<>();
                map.put(key,list);
            }
            map.get(key).add(str);
        }
        return new ArrayList<List<String>>(map.values());

    }
}

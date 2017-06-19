package leetcode.String;

/**
 * Created by lenovo on 2017/6/19.
 */
/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class ImplementStr {
    public int strStr(String haystack, String needle) {

        if(needle.equals(""))
            return 0;
        int lenh=haystack.length();
        int lenn=needle.length();
        if(lenh<lenn)
            return -1;
        for(int i=0;i<=lenh-lenn;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String sub=haystack.substring(i,i+lenn);
                if(sub.equals(needle))return i;
            }
        }
        return -1;
    }
}

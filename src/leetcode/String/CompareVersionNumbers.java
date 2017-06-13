package leetcode.String;

/**
 * Created by lenovo on 2017/6/13.
 */
/*
Total Accepted: 82954
Total Submissions: 418737
Difficulty: Medium
Contributor: LeetCode
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {

        String[] level1=version1.split("\\.");
        String[] level2=version2.split("\\.");

        int len=Math.max(level1.length,level2.length);
        for(int i=0;i<len;i++){
            int ver1=(i<level1.length)?Integer.parseInt(level1[i]):0;
            int ver2=(i<level2.length)?Integer.parseInt(level2[i]):0;
            int res=(ver1-ver2);
            if(res!=0)
                return (res<0)?-1:1;
        }

        return 0;

    }
}

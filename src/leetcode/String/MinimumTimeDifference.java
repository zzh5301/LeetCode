package leetcode.String;

import java.util.List;

/**
 * Created by lenovo on 2017/6/18.
 */

/*
Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes difference between any two time points in the list.

Example 1:
Input: ["23:59","00:00"]
Output: 1
Note:
The number of time points in the given list is at least 2 and won't exceed 20000.
The input time is legal and ranges from 00:00 to 23:59.
 */
public class MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {

        boolean[] b=new boolean[24*60];
        for(String s:timePoints){
            String[] tem=s.split(":");
            int h=Integer.parseInt(tem[0]);
            int m=Integer.parseInt(tem[1]);
            if(b[h*60+m])return 0;
            b[h*60+m]=true;
        }

        int pre=-1;
        int first=Integer.MAX_VALUE;
        int last=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<24*60;i++){
            if(b[i]){
                if(pre!=-1){
                    min=Math.min(min,i-pre);
                }
                first=Math.min(first,i);
                last=Math.max(last,i);
                pre=i;
            }
        }

        return Math.min(min,24*60-last+first);

    }
}

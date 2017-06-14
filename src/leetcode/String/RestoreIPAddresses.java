package leetcode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */

/*
Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class RestoreIPAddresses {
    List<String> res=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s==null||s.length()==0)
            return res;
        dfs(s,0,"",0);
        return res;
    }

    public void dfs(String ip,int count,String str,int index){
        if(count>4)return;
        if(count==4&&index==ip.length()){
            res.add(str);
            return;
        }
        for(int i=1;i<4;i++){
            if(index+i>ip.length())break;
            String s=ip.substring(index,index+i);
            if((s.startsWith("0")&&s.length()>1)||(i==3&&Integer.parseInt(s)>255))continue;
            dfs(ip,count+1,str+s+(count==3?"":"."),index+i);

        }

    }
}

package leetcode.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by lenovo on 2017/6/16.
 */

/*
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
 */
public class SimplifyPath {
    public String simplifyPath(String path) {

        Stack<String> stack=new Stack<>();

        Set<String> skip=new HashSet<>(Arrays.asList("..",".",""));
        for(String dir:path.split("/")){
            if(dir.equals("..")&&!stack.isEmpty())stack.pop();
            else if(!skip.contains(dir))stack.push(dir);
        }
        String res="";
        while(!stack.isEmpty()){
            String s=stack.pop();
            res="/"+s+res;
        }

        return (res.length()==0)?"/":res;


    }
}

package leetcode.binaryTree;

import java.util.*;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Given n processes, each process has a unique PID (process id) and its PPID (parent process id).
Each process only has one parent process, but may have one or more children processes. This is just like a tree structure.
Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.
We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.
Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed,
all its children processes will be killed. No order is required for the final answer.

Example 1:
Input:
pid =  [1, 3, 10, 5]
ppid = [3, 0, 5, 3]
kill = 5
Output: [5,10]
Explanation:
           3
         /   \
        1     5
             /
            10
Kill 5 will also kill 10.
Note:
The given kill id is guaranteed to be one of the given PIDs.
n >= 1.
 */
public class KillProcess {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if(pid==null||ppid==null)
            return new ArrayList<>();

        int n=pid.size();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int pp_id=ppid.get(i);
            int p_id=pid.get(i);
            if(map.get(pp_id)==null){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(p_id);
                map.put(pp_id,list);
            }else{

                map.get(pp_id).add(p_id);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(kill);
        while(!q.isEmpty()){
            int kid=q.poll();
            res.add(kid);
            if(map.get(kid)!=null){
                List<Integer> killList=map.get(kid);
                for(Integer i:killList){
                    q.add(i);
                }
            }

        }
        return res;

    }
}

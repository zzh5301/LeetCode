package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/6/7.
 */
/*
Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

Examples 1
Input:

  5
 /  \
2   -3
return [2, -3, 4], since all the values happen only once, return all of them in any order.
Examples 2
Input:

  5
 /  \
2   -5
return [2], since 2 happens twice, however -5 only occur once.
Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 */
public class MostFrequentSubtreeSum {
    int maxCount=0;

    public int[] findFrequentTreeSum(TreeNode root) {

        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        findFrequentSum(root,map);
        for(int key:map.keySet()){
            if(map.get(key)==maxCount)
                list.add(key);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }

    public int findFrequentSum(TreeNode root,Map<Integer,Integer> map){
        if(root==null)
            return 0;

        int leftSum=findFrequentSum(root.left,map);
        int rightSum=findFrequentSum(root.right,map);
        int sum=root.val+leftSum+rightSum;
        if(map.get(sum)!=null){
            map.put(sum,map.get(sum)+1);
        }else{
            map.put(sum,1);
        }

        maxCount=Math.max(maxCount,map.get(sum));


        return sum;
    }
}

package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/6.
 */
/*

 */
public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeNode root) {
        if(root==null)
            return;
        TreeNode pre=root;
        TreeNode cur=null;
        while(pre.left!=null){
            cur=pre;
            while(cur!=null){
                if(cur.left!=null)cur.left.next=cur.right;
                if(cur.next!=null){
                    cur.right.next=cur.next.left;
                }
                cur=cur.next;
            }
            pre=pre.left;
        }




    }
}

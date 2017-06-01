package leetcode.binaryTree;

/**
 * Created by lenovo on 2017/6/1.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null)
            return root;

        TreeNode l=invertTree(root.right);
        TreeNode r=invertTree(root.left);

        root.left=l;
        root.right=r;

        return root;

    }
}

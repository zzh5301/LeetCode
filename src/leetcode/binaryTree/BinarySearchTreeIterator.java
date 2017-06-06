package leetcode.binaryTree;

import java.util.Stack;

/**
 * Created by lenovo on 2017/6/6.
 */
/*
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
 */
public class BinarySearchTreeIterator {
    Stack<TreeNode> stack=new Stack<>();

    class BSTIterator {
        public BSTIterator(TreeNode root) {

            pushAll(root);

        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {

            return !stack.isEmpty();
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode node = stack.pop();
            pushAll(node.right);
            return node.val;
        }

        public void pushAll(TreeNode node) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }

        }
    }
}

package g0001_0100.s0099_recover_binary_search_tree;

import com_github_leetcode.TreeNode;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    public void recoverTree(TreeNode root) {
        evalSwappedNodes(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void evalSwappedNodes(TreeNode curr) {
        if (curr == null) {
            return;
        }
        evalSwappedNodes(curr.left);
        if (prev != null && prev.val > curr.val) {
            if (first == null) {
                first = prev;
            }
            second = curr;
        }
        prev = curr;
        evalSwappedNodes(curr.right);
    }
}

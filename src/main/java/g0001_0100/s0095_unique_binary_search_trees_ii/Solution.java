package g0001_0100.s0095_unique_binary_search_trees_ii;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();
        result.add(new TreeNode(1));
        for (int i = 2; i <= n; i++) {
            List<TreeNode> nresult = new ArrayList<>();
            for (TreeNode r : result) {
                TreeNode node = new TreeNode(i, r, null);
                nresult.add(node);

                TreeNode previous = r;
                while (previous != null) {
                    node = new TreeNode(i);
                    TreeNode cr = copy(r);
                    insert(cr, node, previous);
                    previous = node.left;
                    nresult.add(cr);
                }
            }
            result = nresult;
        }
        return result;
    }

    void insert(TreeNode dest, TreeNode n, TreeNode from) {
        if (dest.val == from.val) {
            TreeNode h = dest.right;
            dest.right = n;
            n.left = h;
            return;
        }
        insert(dest.right, n, from);
    }

    TreeNode copy(TreeNode n) {
        if (n == null) {
            return null;
        }
        return new TreeNode(n.val, copy(n.left), copy(n.right));
    }
}

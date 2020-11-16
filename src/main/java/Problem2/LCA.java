package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode<Integer> currentNodeLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode<Integer> currentNodeRight = lowestCommonAncestor(root.right, p, q);
        if (currentNodeLeft != null && currentNodeRight != null) {
            return root;
        } else if (currentNodeLeft != null) {
            return currentNodeLeft;
        } else {
            return currentNodeRight;
        }
    }
}

// credit to https://www.educative.io/edpresso/how-to-find-the-lowest-common-ancestor-in-binary-tree
// for explanation of implementation

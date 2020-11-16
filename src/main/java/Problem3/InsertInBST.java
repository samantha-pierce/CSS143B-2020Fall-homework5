package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        TreeNode<Integer> nodeToInsert = new TreeNode<>(valToInsert);
        // base case
        if (root == null) {
            return;
        }
        if (valToInsert <= root.val) {
            insert(root.left, valToInsert);
            if (root.left == null) {
                root.left = nodeToInsert;
            }
        } else {
            insert(root.right, valToInsert);
            if (root.right == null) {
                root.right = nodeToInsert;
            }
        }
    }
}

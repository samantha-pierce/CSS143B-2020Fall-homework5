package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // I used a linked list, because with linked lists it is easy to
        // just add or pop off a value without using extra memory
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> node = q.remove();
                oneResult.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            result.add(oneResult);
        }
        return result;
    }
}

// credit to https://www.youtube.com/watch?v=XZnWETlZZ14 for explanation of problem

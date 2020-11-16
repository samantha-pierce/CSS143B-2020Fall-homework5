package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode<Integer> currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode<Integer> node = stack.pop();
                result.add(node.val);
                currentNode = node.right;
            }
        }
        return result;
    }
}

// credit to https://www.educative.io/edpresso/how-to-perform-an-iterative-inorder-traversal-of-a-binary-tree
// for explanation on how to implement

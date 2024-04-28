import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalIteration {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                if (node.right != null)
                    stack.push(node.right);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
            if (node != null)
                postorder.add(node.val);
        }

        return postorder;
    }

    // Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

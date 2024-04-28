import java.util.ArrayList;
import java.util.List;

public class PostorderTraversalRecursion {
    List<Integer> preorder = new ArrayList<>();

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        traverse(node.left);
        traverse(node.right);
        preorder.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return preorder;
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

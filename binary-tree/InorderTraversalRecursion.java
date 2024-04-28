import java.util.ArrayList;
import java.util.List;

public class InorderTraversalRecursion {
    List<Integer> inorder = new ArrayList<>();

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        traverse(node.left);
        inorder.add(node.val);
        traverse(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return inorder;
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

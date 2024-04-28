import java.util.ArrayList;
import java.util.List;

class PreorderTraversalRecursion {

    List<Integer> preorder = new ArrayList<>();

    public void traverse(TreeNode node) {
        if (node == null)
            return;

        preorder.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
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
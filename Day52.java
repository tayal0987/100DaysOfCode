/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int height = Math.max(left, right) + 1;
        return height;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int MaxDepth = maxDepth(root.left) + maxDepth(root.right);

        int diameter = Math.max(MaxDepth, Math.max(leftD, rightD));
        return diameter;
    }
}



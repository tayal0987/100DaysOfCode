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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            return newNode;
        }
        TreeNode prev = null;
        TreeNode current = root;

        while (current != null) {
            prev = current;
            if (val == current.val) {
                return root; 
            } else if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (val < prev.val) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        return root; 
    }
}

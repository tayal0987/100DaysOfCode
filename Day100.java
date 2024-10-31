/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int sum = 0;
    private int maxLevel = -1;
    public int deepestLeavesSum(TreeNode root) {
        calculateDeepestLeavesSum(root, 0);
        return sum;
    }
    private void calculateDeepestLeavesSum(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        // If it's a leaf node
        if (node.left == null && node.right == null) {
            if (level > maxLevel) {
                maxLevel = level;
                sum = node.val;  
            } else if (level == maxLevel) {
                sum += node.val; 
            }
        }
        // Traverse left and right children
        calculateDeepestLeavesSum(node.left, level + 1);
        calculateDeepestLeavesSum(node.right, level + 1);
    }
}
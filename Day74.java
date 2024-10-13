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
    private int count = 0;
    private int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        InorderTraversal(root, k);
            return result;
    }
        public void InorderTraversal(TreeNode Node, int k){
            if(Node == null){
                return;
            }
            InorderTraversal(Node.left,k);
            count++;
            if(count == k){
                result = Node.val;
                return;
        } 
        InorderTraversal(Node.right, k);
    }
}
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
    public int sumNumbers(TreeNode root) {
        return SumOfNodes(root, 0);
    }

    public int SumOfNodes(TreeNode Node, int currSum){
        if(Node == null){
            return 0;
        }

        currSum = currSum*10+Node.val;

        if(Node.left == null && Node.right == null){
            return currSum;
        }

        int left = SumOfNodes(Node.left, currSum);
        int right = SumOfNodes(Node.right, currSum);

        return left + right;
    }
}



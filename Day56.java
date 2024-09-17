// Minimum Depth of Binary Tree


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
//  */
// class Solution {
//     public int minDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         int left = minDepth(root.left);
//         int right = minDepth(root.right);

//         // If both left and right children are null, it's a leaf node
//         if (root.left == null && root.right == null) {
//             return 1;
//         }
//         if (root.left == null) {
//             return right + 1;
//         }
//         if (root.right == null) {
//             return left + 1;
//         }
//         return Math.min(left, right) + 1;
//     }
// }


// Path Sum 

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        
    }
}



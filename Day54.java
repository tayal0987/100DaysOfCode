// Search in a Binary Search Tree 

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
// class Solution {
//     public TreeNode searchBST(TreeNode root, int val) {

//         if(root == null){
//             return null;
//         }
//         if(root.val > val){
//             return searchBST(root.left, val);
//         }
//         else if(root.val == val){
//             return root;
//         }
//         // (root.val < val)
//         else{
//             return searchBST(root.right, val);
//         }
//     }
// }


// Range Sum of BST 

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
 */class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0; 
        }
        int sum = 0;

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}








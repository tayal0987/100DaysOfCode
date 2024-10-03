// Validate Binary Search Tree

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
//  */
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//     }

//     private boolean isValidBST(TreeNode node, long min, long max) {
//         if (node == null) {
//             return true;
//         }
//         if (node.val <= min || node.val >= max) {
//             return false;
//         }
//     return isValidBST(node.left, min, node.val) && 
//         isValidBST(node.right, node.val, max);  
//     }
// }


// Single Number II

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 3) {
            if(nums[i] != nums[i - 1]){
            return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }
}




















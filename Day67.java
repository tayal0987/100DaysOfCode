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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        helper(res, root, hm);
        return res;
    }
    public String helper(List<TreeNode> res, TreeNode root, HashMap<String, Integer> hm) {
        if (root == null) {
            return "#"; // Use a unique marker for null
        }
        String left = helper(res, root.left, hm);
        String right = helper(res, root.right, hm);

        String stringFormed = root.val + "$" + left + "$" + right;
        // Check if this subtree has been seen before
        hm.put(stringFormed, hm.getOrDefault(stringFormed, 0) + 1);
        if (hm.get(stringFormed) == 2) {
            res.add(root); 
        }
        return stringFormed;
    }
}
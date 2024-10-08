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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateTreesHelper(1, n);
    }

    private List<TreeNode> generateTreesHelper(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if (start > end) {
            trees.add(null);
            return trees;
        }

        for (int rootVal = start; rootVal <= end; rootVal++) {
            List<TreeNode> leftTrees = generateTreesHelper(start, rootVal - 1);
            List<TreeNode> rightTrees = generateTreesHelper(rootVal + 1, end);

            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode root = new TreeNode(rootVal);
                    root.left = leftTree;
                    root.right = rightTree;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
}

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
    int PreorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int[] inorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[PreorderIndex++]);
        int inorderIndex = findInorderIndex(inorder, inorderStart, inorderEnd, root.val);
        root.left = build(preorder, inorder, inorderStart, inorderIndex - 1);
        root.right = build(preorder, inorder, inorderIndex + 1, inorderEnd);
        return root;
    }
    private int findInorderIndex(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i; 
            }
        }
        return -1; 
    }
}




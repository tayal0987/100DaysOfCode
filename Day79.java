// Lowest Common Ancestor of a Binary Tree

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null){
//             return null;
//         }      
//         if(root == null || root.val == p.val || root.val == q.val){
//             return root;
//         }  
//         TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
//         TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

//         if(leftLCA == null){
//             return rightLCA;
//         }
//         if(rightLCA == null){
//             return leftLCA;
//         }
//         return root;
//     }
// }


// Minimum Distance Between BST Nodes


class Solution {
    private Integer prev = null; 
    private int minDiff = Integer.MAX_VALUE; 

    public int minDiffInBST(TreeNode root) {
        inorder(root); 
        return minDiff;  
    }
    private void inorder(TreeNode node) {
        if (node == null) {
            return;         }
        inorder(node.left);
        
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val; 
        inorder(node.right);
    }
}



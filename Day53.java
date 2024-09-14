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
    public TreeNode deleteNode(TreeNode root, int key) {  
        // Search Node to delete  
        if (root == null) {  
            return null; // 
        }  

        if (key < root.val) {  
            root.left = deleteNode(root.left, key); 
        } 
        else if (key > root.val) {  
            root.right = deleteNode(root.right, key); 
        } 
        else {  
            // key == root.val  
            if (root.left == null && root.right == null) {  
                return null; // No children, remove the node  
          
            } 
            else if (root.left == null) {  
                return root.right; // Only right child  
            } 
            else if (root.right == null) {  
                return root.left; // Only left child  
            }  

            TreeNode successor = getMin(root.right); 
            root.val = successor.val; 
            root.right = deleteNode(root.right, successor.val); // Delete the successor  
        }  
        return root; 
    }  

    public TreeNode getMin(TreeNode node) {  
        while (node.left != null) {  
            node = node.left;  
        }  
        return node; 
    }  
}
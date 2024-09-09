// Binary Tree Inorder Traversal

// class Solution {
//     public void Inorder(TreeNode root, List<Integer> data){
//          if(root != null){
//             Inorder(root.left, data);
//             data.add(root.val);
//             Inorder(root.right, data);
//         }
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> data = new ArrayList<>();
//         Inorder(root, data);
//         return data;
//     }
// }


// Binary Tree Preorder Traversal

// class Solution {
//     public void preorder(TreeNode root, List<Integer> data){
//          if(root != null){
//             data.add(root.val);
//             preorder(root.left, data);
//             preorder(root.right, data);
//         }
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> data = new ArrayList<>();
//         preorder(root, data);
//         return data;
//     }
// }


// Binary Tree Postorder Traversal

class Solution {
    public void postorder(TreeNode root, List<Integer> data){
         if(root != null){
            postorder(root.left, data);
            postorder(root.right, data);
            data.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        postorder(root, data);
        return data;
    }
}

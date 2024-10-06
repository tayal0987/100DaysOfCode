
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binaryTreePaths(root, "", list);
        return list;
    }

    private void binaryTreePaths(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }
        path += root.val;
        if (root.left == null && root.right == null) {
            list.add(path);
        } else {
            path += "->";
            binaryTreePaths(root.left, path, list);
            binaryTreePaths(root.right, path, list);
        }
    }
}
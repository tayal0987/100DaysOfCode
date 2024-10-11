/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private ListNode findmid(ListNode start,ListNode end){
        ListNode fast=start,slow = start;
        while (fast != end &&fast.next!=end ) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    private TreeNode helper(ListNode start,ListNode end){
        if (start == end)return null;
        ListNode mid =findmid(start,end);
        TreeNode root = new TreeNode(mid.val);
        root.left = helper(start, mid);
        root.right =helper(mid.next, end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head,null);
    }
}
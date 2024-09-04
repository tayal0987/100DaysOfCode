/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // Find the size of the linked list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If the head needs to be removed
        if (n == size) {
            return head.next;
        }

        // Find the index to remove
        int indexToSearch = size - n;
        ListNode prev = head;

        // Traverse to the node just before the one to remove
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head; // Return the modified list
    }
}

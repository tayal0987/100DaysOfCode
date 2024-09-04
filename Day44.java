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
class Solution {
    // Function to reverse the linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // Return the new head of the reversed list
    }

    // Function to find the middle of the linked list
    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle; // Return the middle node
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        // Find the middle of the linked list
        ListNode middle = findMiddle(head);
        // Reverse the second half of the linked list
        ListNode secondHalfStart = reverse(middle.next);
        
        ListNode firstHalfStart = head; // Start from the beginning of the list
        ListNode secondHalfCopy = secondHalfStart; // Keep a copy to restore later

        // Compare the first half and the reversed second half
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false; // Not a palindrome
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        // Restore the original list (optional)
        middle.next = reverse(secondHalfCopy); // Restore the original list

        return true; // The list is a palindrome
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dHead = new ListNode(0);// Dummy head
        ListNode Current = dHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int Sum = carry;

            if (l1 != null) {
                Sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                Sum += l2.val;
                l2 = l2.next;
            }

            carry = Sum / 10;
            Current.next = new ListNode(Sum % 10);// Create a new node with the digit value
            Current = Current.next;// Move to the next node in the result list
        }

        if (carry > 0) {
            Current.next = new ListNode(carry);
        }
        return dHead.next;// Return the result list, skipping the dummy head
    }
}





// Linked List Cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode Slow = head;
//         ListNode Fast = head;

//         while (Fast != null && Fast.next != null) {
//             Slow = Slow.next;
//             Fast = Fast.next.next;

//             if (Slow == Fast) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }



// Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Day25 {
    public ListNode detectCycle(ListNode head) {
        ListNode Slow = head;
        ListNode Fast = head;
        ListNode Entry = head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;

            if (Slow == Fast) {
                while (Entry != Slow) {
                    Entry = Entry.next;
                    Slow = Slow.next;
                }
                return Entry;
            }
        }
        return null;

    }
}
// Single Numbee

// class Solution {
//     public int singleNumber(int[] nums) {
//         // Sort the Array
//         Arrays.sort(nums);

//         if (nums.length == 1) {
//             return nums[0];
//         }

//         for (int i = 0; i < nums.length - 1; i += 2) {
//             if (nums[i] != nums[i + 1]) {
//                 return nums[i];
//             }
//         }
//         return nums[nums.length - 1];

//     }
// }

// Delete Node in a linkedlist


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prevNode = null;

        while (node.next != null) {
            node.val = node.next.val;
            prevNode = node;
            node = node.next;
        }
        prevNode.next = null;

    }
}
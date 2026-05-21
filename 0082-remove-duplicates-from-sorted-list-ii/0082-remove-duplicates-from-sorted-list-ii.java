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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // duplicate check
            if (curr.next != null && curr.val == curr.next.val) {

                int x = curr.val;

                // skip all nodes with value x
                while (curr != null && curr.val == x) {
                    curr = curr.next;
                }

                prev.next = curr;   // remove duplicate group
            }
            else {
                // unique node
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}

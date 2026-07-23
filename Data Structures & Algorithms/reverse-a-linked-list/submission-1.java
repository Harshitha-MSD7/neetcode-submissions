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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode tmp = prev.next;

        head.next = null;

        while(tmp != null){
            ListNode front = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = front;
        }

        return prev;

    }
}

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
        ListNode tmp = head;
        Deque<Integer> stack = new ArrayDeque<>();

        while(tmp != null){
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        tmp = head;
        while(tmp != null){
            tmp.val = stack.pop();
            tmp = tmp.next;
        }

        return head;
    }
}

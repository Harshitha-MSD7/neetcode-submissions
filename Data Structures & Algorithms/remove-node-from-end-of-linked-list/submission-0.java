class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    if (head == null){
    return null;
    }

    ListNode size = head;
    int count = 0;
    ListNode ptr = dummy;

    // calculating the size of the linked list
    while(size != null){
    size = size.next;
    count ++;
    }

    int i = count - n;
    int j = 0;
    while(j<i){
    ptr = ptr.next;
    j++;
    }
    ptr.next = ptr.next.next;

    return dummy.next;
    }
}
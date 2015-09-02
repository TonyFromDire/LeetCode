/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode p1 = start, p2 = start;
        int i = n;
        while(i > 0 && p2.next != null) {
            p2 = p2.next;
            i--;
        }
        if(i > 0) {
            return head;
        }
        while(p2.next !=null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return start.next;
    }
}
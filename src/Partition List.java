/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);  
        ListNode greaterHead = new ListNode(0);  
        ListNode node = head, less = lessHead, greater = greaterHead;  
        while (node != null) {  
            ListNode next = node.next;  
            if (node.val < x) {  
                less.next = node;  
                less = less.next;  
                less.next = null;  
            } else {  
                greater.next = node;  
                greater = greater.next;  
                greater.next = null;  
            }  
            node = next;  
        }  
        less.next = greaterHead.next;  
        return lessHead.next;
    }
}
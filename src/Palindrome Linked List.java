/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = p1.next;
        ListNode pre = p1;
        //find mid pointer, and reverse head half part
        while(p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            pre = p1;
            p1 = p3;
            p3 = p3.next;
            p1.next = pre;
        }

        //odd number of elements, need left move p1 one step
        if(p2.next == null) {
            p1 = p1.next;
        }
        else {   //even number of elements, do nothing

        }
        //compare from mid to head/tail
        while(p3 != null) {
            if(p1.val != p3.val) {
                return false;
            }
            p1 = p1.next;
            p3 = p3.next;
        }
        return true;
    }
}
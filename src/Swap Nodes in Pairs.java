/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;//previous nodes to two adjacent nodes.
        ListNode A, B, post;//A and B are the two adjacent nodes, post, the following one

        while(pre.next != null && pre.next.next !=null){//it is the end if there is not at least two nodes.
            A = pre.next; B = A.next; post = B.next;//initializing nodes from previous node;
            //swapping
            pre.next = B;
            B.next = A;

            //do not forget to point to last node
            A.next = post;

            //Let's go for another turn !
            pre = A;
        }
        return dummy.next;
    }
}
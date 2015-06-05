/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 		if(l1 == null && l2 == null){  
           return null;  
        }  
         if(l1 == null){  
             return l2;  
        }  
         if(l2 == null){  
            return l1;  
        }  
 		ListNode a = null;
		while (l1!=null&&l2!=null&&l1.next != null && l2.next != null) {
			if (l1.val >= l2.val) {
				a=l2;
			}else {
				a=l1;
			}
			l1=l1.next;
			l2=l2.next;
			a=a.next;
		}
		if (a!=null&&l1!=null&&l2!=null&&l1.next==null&&l2.next!=null) {
			a.val=l2.val;
			l2=l2.next;
			a=a.next;
		}
		if (a!=null&&l1!=null&&l2!=null&&l2.next==null&&l1.next!=null) {
			a.val=l1.val;
			l1=l1.next;
			a=a.next;
		}
		return a; 
    }  
}
public class Solution {
    public boolean hasCycle(ListNode head) {
    	if (head==null) {
			return false;
		}
    	ListNode runner1=head;
    	ListNode runner2=head;
    	while (runner1.next!=null&&runner2.next!=null&&runner2.next.next!=null) {
			runner1=runner1.next;
			runner2=runner2.next.next;
			if (runner1==runner2) {
				return true;
			}
			
		}
    	
    	return false;
    }
}
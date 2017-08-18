package É¾³ýÁ´±íÔªËØ;

public class Solution {

	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		n1.next=n2;
		System.out.println(new Solution().removeElements(n1, 1)==null);
	}
	/*
	 * @param head: a ListNode
	 * @param val: An integer
	 * @return: a ListNode
	 */
	public ListNode removeElements(ListNode head, int val) {
		// write your code here
		if(head==null) {
			return null;
		}
		if(head.next==null&&head.val==val) {
			return null;
		}
		if(head.next==null&&head.val!=val) {
			return head;
		}
		ListNode pre=head;
		ListNode q=head;
		while(q!=null) {
			if(q.val==val) {
				if(q==head) {
					head=head.next;
				}else {
					pre.next=q.next;
				}
			}
			pre=q;
			q=q.next;
		}
		return head;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
}
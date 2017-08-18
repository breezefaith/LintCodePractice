package Á´±íÏà¼Ó;

public class Solution {

	public static void main(String[] args) {

	}
	public ListNode addLists(ListNode l1, ListNode l2) {
		ListNode p1=l1,p2=l2;
		int c=0;
		ListNode result=new ListNode(Integer.MIN_VALUE);
		ListNode p=result;
		int bitSum=0;
		while(p1!=null&&p2!=null) {
			bitSum=c+p1.val+p2.val;
			if(bitSum>9) {
				c=1;
				bitSum=bitSum-10;
			}else {
				c=0;
			}
			p.next=new ListNode(bitSum);	
			p=p.next;
			p1=p1.next;
			p2=p2.next;
		}
		while(p1!=null&&p2==null) {
			bitSum=c+p1.val;
			if(bitSum>9) {
				c=1;
				bitSum=bitSum-10;
			}else {
				c=0;
			}
			p.next=new ListNode(bitSum);
			p=p.next;
			p1=p1.next;
		}
		while(p1==null&&p2!=null) {
			bitSum=c+p2.val;
			if(bitSum>9) {
				c=1;
				bitSum=bitSum-10;
			}else {
				c=0;
			}
			p.next=new ListNode(bitSum);
			p=p.next;
			p2=p2.next;
		}
		if(c==1) {
			p.next=new ListNode(1);
		}
		return result.next;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;      
	}
}
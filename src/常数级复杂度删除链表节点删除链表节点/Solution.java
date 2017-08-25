package ���������Ӷ�ɾ������ڵ�ɾ������ڵ�;

/***
 * ����һ���������е�һ���ȴ���ɾ���Ľڵ�(�Ǳ�ͷ���β)��������O(1)ʱ�临�Ӷ�ɾ��������ڵ㡣
 * ����
    Linked list is 1->2->3->4, and given node 3, delete the node in place 1->2->4
 */
public class Solution {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        ListNode p=node;

        p.val=p.next.val;
        p.next=p.next.next;
        node=p;
    }

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
}
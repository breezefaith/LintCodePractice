package 常数级复杂度删除链表节点删除链表节点;

/***
 * 给定一个单链表中的一个等待被删除的节点(非表头或表尾)。请在在O(1)时间复杂度删除该链表节点。
 * 样例
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
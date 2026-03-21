/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);

        if(head == null || head.next == null )
        {
            return head;
        }

        ListNode node1 = head;
        dummy.next = head;
        ListNode prev = dummy;

        while(node1!=null && node1.next!=null){
           ListNode node2 = node1.next;
           node1.next = node2.next;
           node2.next = prev.next;
           prev.next = node2;
           prev = node1;
           node1 = node1.next;
        }


        return dummy.next;
    }
}
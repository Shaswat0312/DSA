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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n1 = head;
        ListNode n2 = head;
        int count = 1;
        while(count!=k){
            n1 = n1.next;
            count++;
        }
        ListNode begPoint = n1;
        int begval = n1.val;

        while(n1.next!=null){
            n1 = n1.next;
            n2 = n2.next;
        }

        int endVal = n2.val;


        begPoint.val = endVal;
        n2.val = begval;


        return head;
        
    }
}
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }

        int uniformSize =  len/k;
        int remain = len %k;
        ListNode[] res = new ListNode[k];
        curr = head;

       for(int i =0;i<k;i++)
       {
        int count = uniformSize;
        if(remain>0){
            count = count + 1;
            remain = remain -1;
        }
        ListNode temp = curr;
        int counter = 0;
        ListNode prev = null;
        while(counter<count){
            prev = curr;
            curr = curr.next;
            counter++;
        }
        if(prev!=null)
            prev.next = null;

        res[i] = temp;
       }

    return res;

    }
}
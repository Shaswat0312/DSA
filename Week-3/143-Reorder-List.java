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
     public ListNode reverseLL(ListNode curr)
    {
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head,
                fast = head;
            
            while(fast!=null&&fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }


             ListNode s1 = head,
                    s2 = reverseLL(slow.next);
                    slow.next = null;
            while(s1!=null && s2!=null){
                ListNode s1nxt = s1.next;
                ListNode s2nxt = s2.next;
                        s1.next = s2;
                        s2.next = s1nxt;
                        s1 = s1nxt;
                        s2 = s2nxt;
            }
    }
}
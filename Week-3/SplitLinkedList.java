public class SplitLinkedList {
    /* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) 
    {
        
        Node slow = head,
             fast = head.next;
            
            while(fast!=head && fast.next!=head){
                slow = slow.next;
                if(fast.next.next==head)
                {
                    fast = fast.next;
                }
                else
                {
                    fast = fast.next.next;
                }
            }
            
            Node head2 = slow.next;
            slow.next = head;
            fast.next = head2;
            
            
            
            
            return new Pair<>(head,head2);
    }
}
}

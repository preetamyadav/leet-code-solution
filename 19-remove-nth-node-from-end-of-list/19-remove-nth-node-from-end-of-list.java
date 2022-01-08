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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fstPtr = head;
        while(n >0){
            fstPtr=fstPtr.next;
            n--;
        }
        ListNode prevNode = null;
        ListNode slowPtr= head;
        while(fstPtr !=null){
            fstPtr = fstPtr.next;
            prevNode = slowPtr;
            slowPtr = slowPtr.next;
        }
        
        if(prevNode !=null){
            prevNode.next = slowPtr.next;
            slowPtr.next = null;
        }else{
            if(head.next !=null){
                prevNode = head;
                head= head.next;
                prevNode.next = null;
            }else{
                head = prevNode;    
            }
        }
        return head;
    }
}
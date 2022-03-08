/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
                return false;
        if(head.next == null)
                return false;
        
        ListNode fstPtr = head.next;
        ListNode slowPtr  = head;
        while(fstPtr != null && fstPtr.next != null  ){
            if(fstPtr == slowPtr)
                    return true;
            fstPtr = fstPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return false;
    }
}
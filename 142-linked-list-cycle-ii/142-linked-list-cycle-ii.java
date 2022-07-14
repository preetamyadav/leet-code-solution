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
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return null;
        
        ListNode slowPtr = head;
        ListNode fstPtr = head;
         boolean isLoopExists = false;
        while(fstPtr !=null  && fstPtr.next != null){
            slowPtr = slowPtr.next;
            fstPtr = fstPtr.next.next;
            if(fstPtr == slowPtr){
                isLoopExists = true;
                break;
            }
           
        }
        if(isLoopExists){
            slowPtr = head;
            while(slowPtr != fstPtr){
                fstPtr = fstPtr.next;
                slowPtr = slowPtr.next;
            }
        }else{
            return null;
        }
        
        return fstPtr;
        
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slowPtr = new ListNode(0);
        ListNode temp = slowPtr;
        ListNode ptr = head;
        slowPtr.next = head;
        
        while(ptr !=null){
            while(ptr.next !=null && ptr.val == ptr.next.val){
                ptr = ptr.next;
            }
            if(slowPtr.next != ptr){
                slowPtr.next = ptr.next;
                ptr = slowPtr.next;
            }else{
                slowPtr = slowPtr.next;
                ptr = ptr.next;
            }
        }
        return temp.next;
    }
}
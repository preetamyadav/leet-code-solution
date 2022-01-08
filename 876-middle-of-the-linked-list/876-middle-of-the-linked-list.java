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
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fstPtr = head;
        while(fstPtr!=null && fstPtr.next !=null ){
            slowPtr = slowPtr.next;
            fstPtr = fstPtr.next.next;
        }
        return slowPtr;
    }
}
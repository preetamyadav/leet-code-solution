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
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode first = head;
        ListNode second = head.next;
        while(second !=null){
            ListNode temp1 = first.next.next;
            ListNode temp2 = null;
            if(second.next !=null){
                temp2 = second.next.next;
            }
            if(prevNode ==null){
                second.next = first;
                first.next = temp1;
                prevNode = first;
            }else{
                prevNode.next = second;
                second.next = first;
                first.next = temp1;
                prevNode = first;
            }
            if(first == head){
                head = second;
            }
            first = temp1;
            second = temp2;
        }
        return head;
        
    }
}
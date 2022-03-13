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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode currentNode = head;
        
        ListNode tempPtr = null;
        ListNode sHead = null;
        ListNode temp = currentNode;
        while(currentNode !=null && currentNode.next !=null){
             temp = currentNode;
            if(tempPtr != null){
                tempPtr.next = currentNode.next;
                tempPtr = tempPtr.next;
            }else{
                tempPtr = currentNode.next;
                sHead= tempPtr;
            }
         
            currentNode = currentNode.next.next;
            temp.next = currentNode;
        }
        if(tempPtr !=null ){
            tempPtr.next =null;
        }
        
        if(currentNode == null){
            temp.next = sHead;
        }else{
            currentNode.next = sHead;
        }
        
        return head;
        
    }
}
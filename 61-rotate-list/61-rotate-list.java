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
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null){
            return head;
        }
         int length = this.lengthOfList(head);
        while(k > length){
            k = k % length;
        }
        if(k <= 0){
            return head;
        }
        ListNode newHead = this.reverseLinkedList(head,null);
      
        
        System.out.println(k);
        ListNode divideNode = this.getDivideNode(newHead,k);
        ListNode tempNode = divideNode.next;
        ListNode firstPart = this.reverseLinkedList(newHead,divideNode.next);
        ListNode secondPart = this.reverseLinkedList(tempNode ,null);
        ListNode root = firstPart;
        while(firstPart.next !=null){
            firstPart = firstPart.next;
        }
        firstPart.next = secondPart;
        
        return root;
    }
    
    private ListNode getDivideNode(ListNode node1 ,int k){
        ListNode node = node1;
        while(k > 1 ){
            node = node.next;
            k--;
        }
        return node;
    }
    
    private int lengthOfList(ListNode head1){
        ListNode head = head1;
        int count =0;
        while(head !=null){
            head = head.next;
            count++;
        }
        return count;
    }
    
    private ListNode reverseLinkedList(ListNode head , ListNode end){
        ListNode prev = null;
        ListNode current = head;
        while(current != end){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current= temp;
        }
        return prev;
    }
}
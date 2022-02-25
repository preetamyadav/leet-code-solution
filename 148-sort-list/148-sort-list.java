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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
      
        ListNode tempHead = head;
        ListNode second = this.getMidNode(tempHead);
        ListNode root2 = second.next;
        second.next = null;
        
        ListNode list1 = this.sortList(head);
        ListNode list2 = this.sortList(root2);
        
        return this.merge(list1,list2);
    }
    
    private ListNode merge(ListNode list1,ListNode list2){
        ListNode curr = new ListNode(0);
        ListNode result = curr;
        while(list1 !=null && list2 !=null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 == null ? list2 : list1;
        return result.next;
    }
    
    private ListNode getMidNode(ListNode node){
        ListNode slowPtr = node;
        ListNode fstPtr = node.next;
        while(fstPtr !=null && fstPtr.next != null){
            slowPtr = slowPtr.next;
            fstPtr = fstPtr.next.next;
        }
        return slowPtr;
    }
}
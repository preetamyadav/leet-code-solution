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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = null;
        ListNode preNode =null;
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        if(list2 == null && list1 != null){
            return list1;
        }
        
        while(list1 !=null && list2 != null){
            if(list1.val < list2.val){
                if(list == null){
                    list = new ListNode(list1.val);
                    preNode = list;
                }else{
                    ListNode newNode = new ListNode(list1.val);
                    preNode.next = newNode;
                    preNode = newNode;
                }
                list1 = list1.next;
            }else{
                if(list == null){
                    list = new ListNode(list2.val);
                    preNode = list;
                }else{
                    ListNode newNode = new ListNode(list2.val);
                    preNode.next = newNode;
                    preNode = newNode;
                }
                list2 = list2.next;
            }
        }
        
        while(list1 !=null){
             ListNode newNode = new ListNode(list1.val);
             preNode.next = newNode;
             preNode = newNode;
            list1 = list1.next;
        }
        while(list2 !=null){
             ListNode newNode = new ListNode(list2.val);
             preNode.next = newNode;
             preNode = newNode;
            list2 = list2.next;
        }
        
        return list;
    }
}
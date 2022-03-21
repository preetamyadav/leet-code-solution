/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Map<Node,Node> map = new HashMap<>();
        Node tempHead = head;
        Node newHead = null;
        Node prevNode = null;
        while(tempHead != null){
            Node node = new Node(tempHead.val);
            map.put(tempHead , node);
            if(newHead == null){
                newHead = node;
            }
            
            if(prevNode !=null){
                prevNode.next = node;
            }
            prevNode = node;
            
            tempHead = tempHead.next;
        }
        
        Node temp1 = head;
        Node temp2 = newHead;
        while(temp1 !=null && temp2!=null){
            Node node1 = temp1.random;
            Node node2 = map.get(node1);
            temp2.random = node2;
            temp1= temp1.next;
            temp2 = temp2.next;
        }
        return newHead;
        
    }
}
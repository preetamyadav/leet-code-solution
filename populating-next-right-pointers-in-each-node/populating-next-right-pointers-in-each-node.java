/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prevNode = null;
            for(int index =0; index < size;index++){
                Node tempNode = queue.poll();
                if(prevNode !=null ){
                    prevNode.next = tempNode;
                }
                if(index == size-1){
                    tempNode.next = null;
                }
                if(tempNode.left !=null){
                    queue.offer(tempNode.left);
                }
                if(tempNode.right !=null){
                    queue.offer(tempNode.right);
                }
                prevNode = tempNode;
            }
        }
        return root;
        
    }
}
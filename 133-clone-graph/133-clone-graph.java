/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        
        Map<Node ,Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        map.put(node,new Node(node.val));
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            for(int index =0; index < curr.neighbors.size();index++){
                Node newNode = curr.neighbors.get(index);
                if(!map.containsKey(newNode)){
                    map.put(newNode ,new Node(newNode.val));
                    queue.add(newNode);
                }
                map.get(curr).neighbors.add(map.get(newNode));
                
            }
        }
        return map.get(node);
        
    }
}
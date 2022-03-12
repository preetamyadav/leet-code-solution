/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode head = root;
        TreeNode root2 = subRoot;
        List<TreeNode> list = this.getNode(head , subRoot);
        for(int index =0; index < list.size();index++){
            TreeNode root1 = list.get(index);
            if(this.isSameNode(root1,root2)){
                return true;
            }
        }
        
       return false;
        
    }
    
    private List<TreeNode> getNode(TreeNode root1 , TreeNode root2){
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> nodes = new ArrayList<>(); 
        queue.offer(root1);
        TreeNode tempNode = null;
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if(node.val == root2.val){
                nodes.add(node);
                tempNode =  node;
            }
            if(node.left !=null){
                queue.offer(node.left);
            }
            if(node.right !=null){
                queue.offer(node.right);
            }
        }
        return nodes;
    }
    
    
    private boolean isSameNode(TreeNode root1 , TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isSameNode(root1.left,root2.left) && isSameNode(root1.right,root2.right);
    }
}
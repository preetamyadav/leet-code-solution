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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLeftToRight = true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(isLeftToRight){
                    subList.add(node.val);
                }else{
                    subList.add(0,node.val);
                }
                if(node.left !=null){
                    queue.offer(node.left);    
                }
                if(node.right !=null){
                    queue.offer(node.right);
                }
            }
            result.add(subList);
            isLeftToRight=!isLeftToRight;
        }
        return result;
    }
}
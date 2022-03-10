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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        this.getInorderTraversal(root,result);
        return result;
    }
    
    private void getInorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        this.getInorderTraversal(root.left,list);
        list.add(root.val);
        this.getInorderTraversal(root.right,list);
    }
}
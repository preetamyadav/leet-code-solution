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
    public boolean isSymmetric(TreeNode root) {
        return this.areIdentical(root.left,root.right);
    }
    
    private boolean areIdentical(TreeNode p , TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p!=null && q!=null){
            if(p.val == q.val){
                return areIdentical(p.left,q.right) && areIdentical(p.right , q.left);
            }
        }
        return false;
        
    }
}
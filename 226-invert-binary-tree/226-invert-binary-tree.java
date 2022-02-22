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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode head = root;
        this.inorderTraversl(head);
        return root;
    }
    
    private void inorderTraversl(TreeNode head){
        if(head == null){
            return;
        }
        TreeNode temp = head.left;
        head.left = head.right;
        head.right = temp;
        inorderTraversl(head.left);
        inorderTraversl(head.right);
    }
}
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode head = root;
        TreeNode treeNode = new TreeNode(val);
        this.getNode(head,val,treeNode);
        return root;
    }
    
    private void getNode(TreeNode root,int val,TreeNode node){
        if(val < root.val){
            if(root.left == null){
                root.left = node;
                return;
            }
            this.getNode(root.left,val,node);
        }else{
            if(root.right == null){
                root.right= node;
                return;
            }
            this.getNode(root.right,val,node);
        }
    }
}
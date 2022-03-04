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

//[5,4,6,null,null,3,7]
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while(root !=null || !stack.isEmpty()){
            while(root !=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && pre.val >= root.val){
                return false;
            }
            pre = root;
            root = root.right;
        }
        return true;
    }
}
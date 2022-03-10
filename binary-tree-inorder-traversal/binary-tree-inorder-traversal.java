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
        //this.getInorderTraversal(root,result);
        result =  this.getIterativeInorder(root);
        return result;
    }
    
    // iterative approcach
    
    private List<Integer> getIterativeInorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        //stack.push(root);
        while(root!=null || !stack.isEmpty()){
           while(root !=null){
               stack.push(root);
               root = root.left;
           }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
    
    // recursive approact
    private void getInorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        this.getInorderTraversal(root.left,list);
        list.add(root.val);
        this.getInorderTraversal(root.right,list);
    }
}
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        //list 
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorderTraversal(root1,list1);
        inorderTraversal(root2,list2);
        
        List<Integer> finalList = new ArrayList<>();
        int i=0;
        int j=0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }else{
                finalList.add(list2.get(j));
                j++;
            }
        }
        
        while(i< list1.size()){
            finalList.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            finalList.add(list2.get(j));
            j++;
        }
        return finalList;
        
    }
    
    private void inorderTraversal(TreeNode root,List<Integer> list){
        if(root == null)
            return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
}
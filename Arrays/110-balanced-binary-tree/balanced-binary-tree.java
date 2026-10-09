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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode left=root.left;
        TreeNode right = root.right;

        boolean isTrue = Math.abs(height(left)-height(right))<=1;

        return isTrue && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode temp){
        if(temp==null){
            return 0;
        }
        return  1 + Math.max(height(temp.left),height(temp.right));
    }
}
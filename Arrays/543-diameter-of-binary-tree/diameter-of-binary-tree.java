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
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return max;
    }
    private int calculateDepth(TreeNode node){
        if(node==null)
        {
            return 0;
        }
        int left=calculateDepth(node.left);
        int right=calculateDepth(node.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
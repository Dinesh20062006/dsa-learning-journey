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
        List<List<Integer>> list = new ArrayList<>();
        if(root== null){
            return list;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean isLeft = true;
        while(!q.isEmpty()){
            int q_size=q.size();
            ArrayList<Integer> curr = new ArrayList<>();
            for(int i =0 ; i<q_size;i++){
                TreeNode temp = q.poll();
                if(isLeft){
                    curr.add(temp.val);
                }
                else{
                    curr.add(0,temp.val);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            list.add(curr);
            isLeft=!isLeft;
        }
        return list;
    }
}
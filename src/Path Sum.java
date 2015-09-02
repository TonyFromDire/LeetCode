/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
    	return treeSumFind(root, sum);
    }
    private boolean treeSumFind(TreeNode root,int sum) {
		if (root==null) {
			return false;
		}
		if (root.left==null&&root.right==null) {
			if (sum-root.val==0) {
				return true;
			}
		}
    	return (treeSumFind(root.left, sum-root.val)||treeSumFind(root.right, sum-root.val));
	}
}
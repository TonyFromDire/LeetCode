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
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<Integer> element = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		recursionmyself(root, list, element, sum);
		return list;
	}


	public void recursionmyself(TreeNode root, List<List<Integer>> list,
			List<Integer> element, int sum) {
	       if(root==null) {  
	            return;  
	        }  
	        element.add(root.val);  
	        if(root.left==null && root.right==null) {  
	            if(sum==root.val) {  
	            	List<Integer> addone=new ArrayList<>(element);
	                list.add(addone);  
	            }  
	        }  
	        recursionmyself(root.left,list,element,sum-root.val);  
	        recursionmyself(root.right,list,element,sum-root.val);  
	        element.remove(element.size()-1);  
		
		
	}
}
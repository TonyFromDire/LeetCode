public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
    	if(candidates == null || candidates.length==0)  
            return res;  
        Arrays.sort(candidates);  
        helper(candidates,0,target,new ArrayList<Integer>(),res);  
        return res;     
    }
	private void helper(int[] candidates, int start, int target,
			ArrayList<Integer> element, List<List<Integer>> res) {
		// TODO Auto-generated method stub
	    if(target<0)  
	        return;  
	    if(target==0)  
	    {  
	        res.add(new ArrayList<Integer>(element));  
	        return;  
	    }  
	    for (int i = start; i < candidates.length; i++) {
	    	 if(i>0 && candidates[i]==candidates[i-1])  
	             continue; //第二题，具有重复元素 
	    	 element.add(candidates[i]); 
	    	 helper(candidates,i,target-candidates[i],element,res); 
	    	 element.remove(element.size()-1); 
		}
	}
}
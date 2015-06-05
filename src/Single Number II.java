public class Solution {
    public int singleNumber(int[] nums) {
                if(nums.length<=0){
        	return -1;
        }
        if(nums.length==1){
        	return nums[0];
        }
        Arrays.sort(nums);
        
    	int j =1;
    	for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				j++;
			}else {
				if (j<3) {
					return nums[i];
				}
				j=1;
			}
		}
        return nums[nums.length-1] ;
    	
    }
}
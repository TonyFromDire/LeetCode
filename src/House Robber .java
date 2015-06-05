public class Solution {
    public int rob(int[] nums) {
        		int n = nums.length;
		if(n==0){
			return 0;
		}
		else if(n==1){
			return nums[0];
		}
		else{
			int[] maxmoney= new int[n];
			maxmoney[0]=nums[0];
			maxmoney[1]=Math.max(nums[0],nums[1]);
			for(int i= 2;i<n;i++){
				maxmoney[i]=Math.max(maxmoney[i-2]+nums[i], maxmoney[i-1]);
				
			}	
			return maxmoney[n-1];
		}
    }
}
public class Solution {
    public int removeDuplicates(int[] nums) {
       		if (nums.length==0) {
			return 0;
		}
        		int j = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i + 1]) {
				continue;
			} else {
			    nums[j]=nums[i+1];
				j++;
			}
		}
		return j;
    }
}
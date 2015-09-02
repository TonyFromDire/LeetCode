public class Solution {
    public int[] productExceptSelf(int[] nums) {
        		int[] res = new int[nums.length];
		Arrays.fill(res, 1);
		for (int i = 1; i < nums.length; i++) {
			res[i]=nums[i-1]*res[i-1];			
		}

		int right =  1;//����¼��ǰ�ұ����еĳ˻�
		for (int i = nums.length-1; i>=0; i--) {
			res[i]=right*res[i];
			right=right*nums[i];
		}
    	return res;
    }
}
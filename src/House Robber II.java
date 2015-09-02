public class Solution {
    public int rob(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return nums[0];
		} else if (n == 2) {
			return Math.max(nums[0], nums[1]);
		} else if (n == 3) {
			int maxtemp=Math.max(nums[0], nums[2]);
			return Math.max(maxtemp, nums[1]);
		} else {
			int[] maxmoney = new int[n];
			int[] maxmoney2 = new int[n];
			int moneywith1;
			int moneywithn;
			// 从第一家开始抢，抢到n-1家
			maxmoney[0] = nums[0];
			maxmoney[1] = Math.max(nums[0], nums[1]);
			for (int i = 2; i < n - 1; i++) {
				maxmoney[i] = Math.max(maxmoney[i - 2] + nums[i],
						maxmoney[i - 1]);

			}
			moneywith1 = maxmoney[n - 2];
			// 从第二家开始抢，抢到n家
			maxmoney2[1] = nums[1];
			maxmoney2[2] = Math.max(nums[1], nums[2]);
			for (int i = 3; i < n; i++) {
				maxmoney2[i] = Math.max(maxmoney2[i - 2] + nums[i],
						maxmoney2[i - 1]);

			}
			moneywithn = maxmoney2[n - 1];
			return Math.max(moneywith1, moneywithn);
		}
    }
}
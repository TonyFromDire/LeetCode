public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int left, right;
		for (int i = 0; i < nums.length; i++) {
			if (i >0 && nums[i] == nums[i - 1])
				continue;
			// int[] num, int begin, int end, int target
			left = i + 1;
			right = nums.length - 1;
			while (left < right) {
				if (nums[left] + nums[right] + nums[i] == 0) {
					List<Integer> ans = new ArrayList<Integer>();
					ans.add(nums[i]);
					ans.add(nums[left]);
					ans.add(nums[right]);
					result.add(ans);
					// È¥ÖØ¸´
					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;
					left++;
					right--;
				} else if (nums[left] + nums[right] + nums[i] > 0) {
					right--;
				} else if (nums[left] + nums[right] + nums[i] < 0) {
					left++;
				}

			}
		}
		return result;
    }
}
public class Solution {
	public int findPeakElement(int[] nums) {
		return isPeak(nums, 0, nums.length - 1);
	}

	public int isPeak(int[] nums, int start, int end) {
		if (start == end) {
			return start;
		} else if (start == end - 1) {
		
			if (nums[start] > nums[end]) {
			
				return start;
			} else {
				
				return end;
			}
		} else {
			int mid = (start + end) / 2;
			if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				return mid;
			} else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
				return isPeak(nums, mid + 1, end);
			} else {
				return isPeak(nums, start, mid - 1);
			}
		}
	}
}
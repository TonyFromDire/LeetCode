public class Solution {
    public boolean containsDuplicate(int[] nums) {
        		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				return true;
			}
		}
		return false;
    }
}
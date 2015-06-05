public class Solution {
    public int majorityElement(int[] nums) {
     		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;// hashmap ´æmap.put(k,v);È¡map.get(k)
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
				if (map.get(nums[i]) > (n / 2)) {
					return nums[i];
				}
			} else {// cunguole
				map.put(nums[i], map.get(nums[i]) + 1);
				if (map.get(nums[i]) > (n / 2)) {
					return nums[i];
				}
			}

		}
		return -1;   
    }
}
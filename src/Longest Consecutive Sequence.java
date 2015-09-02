public class Solution {
    public int longestConsecutive(int[] nums) {
                if(nums == null || nums.length == 0)
            return 0;

        int longest = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length; i++)
            map.put(nums[i],nums[i] + 1);

        for(int j = 0; j < nums.length; j++){
            int current = 1;
            int key = nums[j];
            if (map.containsKey(key - 1))
                continue;
            while (map.containsKey(map.get(key))){
                current++;
                key = map.get(key);
            }
            if (current > longest)
                longest = current;
        }
        return longest;
    }
}
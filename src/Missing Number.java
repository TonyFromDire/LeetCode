public class Solution {
    public int missingNumber(int[] nums) {
        int i, total;
        total  = (nums.length+1)(nums.length)2;   
        for ( i = 0; i nums.length; i++)
           total -= nums[i];
        return total;
    }
}
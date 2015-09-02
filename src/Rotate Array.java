public class Solution {
    public void rotate(int[] nums, int k) {
            int len=nums.length;
        int[] nums_cp=new int[len];

        for(int i=0; i<len; i++){
            nums_cp[(i+k)%len]=nums[i];
        }

        //NOT WORK, reference can not be modified!!!
        //nums=nums_cp;

        //SO, we copy nums_cp to nums
        for(int i=0; i<len; i++){
            nums[i]=nums_cp[i];
        }

        }
    
}
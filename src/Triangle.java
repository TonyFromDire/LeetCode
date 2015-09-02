public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		int row = triangle.size();
		if (row == 0) {
			return 0;
		}
		int[] dp=new int[row+1];
		for(int i = 0; i <=row; i++)  
			dp[i]=Integer.MAX_VALUE;
		
        for(int i = 1; i <=row; i++)  
        {  
            for(int j = i; j >=1; j--)  
            {    if(i == 1 && j == 1) dp[j] = triangle.get(i-1).get(j-1);  

                else {
                	dp[j] = Math.min(dp[j-1], dp[j])+triangle.get(i-1).get(j-1);  //dp[j]代表第i行第j个
				}
            }  
        } 
        int ans = Integer.MAX_VALUE;  
        for(int j = 1; j <=row; j++)  
            ans = Math.min(dp[j], ans);  
        return ans;  
    } 
}
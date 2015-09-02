public class Solution {
    public int minPathSum(int[][] grid) {
                int rows=grid.length;  
        if(rows==0)return 0;  
        int cols=grid[0].length;  
        if(cols==0)return 0;  
        int [][]dp = new int[rows][cols];
       
        for(int i=0;i<rows;++i)  
        {  
            for(int j=0;j<cols;++j)  
            {                 
                if(i==0&&j==0)dp[0][0]=grid[0][0];  
                else if(j==0)dp[i][0]=dp[i-1][0]+grid[i][0];  
                else if(i==0)dp[0][j]=dp[0][j-1]+grid[0][j];  
                else dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];  
            }  
        }  
        return dp[rows-1][cols-1];//返回最右下角的结果          把每个格子的状态都保存到dp【i】【j】中
    }
}
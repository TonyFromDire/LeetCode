public class Solution {
    public int uniquePaths(int m, int n) {//m行，n列代表纵坐标j<=m，横坐标i<=n，最后返回dp[n][m]
        int dp[][] = new int[101][101];//dp[i][j]代表走到当前ij格子有多少种走法i横坐标代表列，j纵坐标代表行
        //dp[i][j]=dp[i-1]dp[j]+dp[i][j-1];
        for (int i = 1; i <=n; i++) {
			dp[i][1]=1;
		}
        for (int j = 1; j <=m; j++) {
			dp[1][j]=1;
		}
	
        for (int i = 2; i <=n; i++) {
			for (int j = 2; j <=m; j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		    
		
    	return dp[n][m];
    }
}
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int[m][n];
        int tempi=Integer.MAX_VALUE;
        int tempj=Integer.MAX_VALUE;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0 || j == 0 )
                {
                    dp[i][j]=1;
                    if(j>tempj) dp[i][j] = 0;
                    else if(i>tempi) dp[i][j] = 0;
                    else if(obstacleGrid[i][j]==1)
                    {
                        dp[i][j] = 0;
                        if(i==0) tempj=j;
                        else tempi=i;

                    }
                
                }
            }
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
            if(obstacleGrid[i][j]==1) dp[i][j]=0;
            else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
return dp[m-1][n-1];
    }
}
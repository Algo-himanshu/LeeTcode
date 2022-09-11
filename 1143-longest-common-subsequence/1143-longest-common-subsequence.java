class Solution {
    public int longestCommonSubsequence(String s1, String s2) 
    {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i = 0;i<s1.length()+1;i++){for(int j = 0;j<s2.length()+1;j++) dp[i][j]=-1;}
        return longestCommonSubsequenceRec(s1,s2,s1.length(),s2.length(),dp);
    }
    public int longestCommonSubsequenceRec(String s1,String s2,int m,int n,int dp[][])    
      {
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0 || n==0) return 0;
        else if(s1.charAt(m-1)==s2.charAt(n-1)) return dp[m][n]=1+longestCommonSubsequenceRec(s1,s2,m-1,n-1,dp);
        else  return dp[m][n]=Math.max(longestCommonSubsequenceRec(s1,s2,m-1,n,dp) , longestCommonSubsequenceRec(s1,s2,m,n-1,dp));
      }    
}
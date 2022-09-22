class Solution {
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int n = floor.length();
        int[][] dp = new int[n + 1][numCarpets + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= numCarpets; j++) {
                if (floor.charAt(i - 1) == '1') dp[i][j] = dp[i - 1][j] + 1;
                else dp[i][j] = dp[i - 1][j];
                if (j > 0) dp[i][j] = Math.min(dp[i][j], dp[Math.max(0, i - carpetLen)][j - 1]);
            }
        }
        return dp[n][numCarpets];
    }
}

// class Solution {
//     public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
//         int i = 0; int ws =0;
//         for(int j = 0;j<floor.length();j++) if(floor.charAt(j)==1) ws++;
//         mini(floor.toCharArray() , numCarpets, carpetLen , i , ws);
//         return ws;
//     }
//     int mini(char ar[] ,  int num, int len , int i , int ws)
//     {
//         if(num==0 || i>ar.length-1) return 0;
//         else if(ar[i]=='1') return Math.min(mini(ar,num-1,len,i+len,ws-1),
//                                           mini(ar,num,len,i+1,ws));
//         else return mini(ar,num,len,i+1,ws);
//     }
// }
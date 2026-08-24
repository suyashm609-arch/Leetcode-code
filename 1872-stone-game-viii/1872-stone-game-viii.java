class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int[] p=new int[n+1];
        p[0]=stones[0];
        for(int i=1;i<n;i++){
         p[i]=stones[i]+p[i-1];
        }
        int[] dp=new int[n+1];
        dp[n-1]=p[n-1];
        for(int i=n-2;i>=1;i--){
            dp[i]=Math.max(dp[i+1],p[i]-dp[i+1]);
        }
        return dp[1];
    }
}
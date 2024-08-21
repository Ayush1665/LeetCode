class Solution {
  public int fib(int n) {
    if(n<=1){
      return n;
  }
      int dp[]=new int[n+1];

      dp[0]=0;
      dp[1]=1;
      for (int i = 2; i <= n; i++) {
        dp[i]=dp[i-1]+dp[i-2];
      }
      return dp[n];
  }
}

// Create an dp array with length n+1
// store dp[0] and dp[1] == n
// store the previous elements in dp[i] 
// return the dp[n];
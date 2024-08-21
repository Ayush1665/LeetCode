class Solution {
  public int climbStairs(int n) {
      if (n == 0 || n == 1) {
          return 1;
      }

      int[] dp = new int[n+1];
      dp[0] = dp[1] = 1;
      
      for (int i = 2; i <= n; i++) {
          dp[i] = dp[i-1] + dp[i-2];
      }
      return dp[n];
  }
}

// create a new array of n+1 size
// set dp[0] and dp[1]=1
// store the answer in dp[i] for steps
// return dp[n]
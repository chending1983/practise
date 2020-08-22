package com.cl.elena.algorithm.offer;

public class offer60 {

	public offer60() {
		// TODO Auto-generated constructor stub
	}
	public double[] twoSum(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];//dp[骰子个数][所有可能的值]
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {//i代表当前骰子的个数
            for (int j = i; j <= 6 * n; j++) {//j代表当前值的和
                for (int k = 1; k <= 6&&k<=j; k++) {//k代表当前筛子的值
                        //状态转移方程： i个骰子和为j += i-1个骰子和为j-k + 第i个骰子值为k
                        dp[i][j] += dp[i-1][j - k];
                }
            }
        }
        final double totalNum = Math.pow(6, n);//总次数
        double[] ans = new double[5*n+1];
        for(int i=n;i<=6*n;i++){
            ans[i-n]=((double)dp[n][i])/totalNum;
        }
        return ans;
    }
}

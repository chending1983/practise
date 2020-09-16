package com.cl.elena.algorithm.offer.recusive;

public class offer10 {

	/**
	 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
	 * 
	 * F(0) = 0,   F(1) = 1 F(N) = F(N - 1) + F(N - 2), 其中 N > 1. 斐波那契数列由 0 和 1
	 * 开始，之后的斐波那契数就是由之前的两数相加而得出。
	 * 
	 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：n = 2 输出：1 示例 2：
	 * 
	 * 输入：n = 5 输出：5  
	 * 
	 * 提示：
	 * 
	 * 0 <= n <= 100
	 * 
	 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer10() {
		// TODO Auto-generated constructor stub
	}
	
	public int fib(int n) {
		int a =0, b =1, sum;
		for (int i = 0; i < n ; i++) {
			sum = (a + b )%1000000007;
			a = b;
			b = sum;
		}
		return a;
    }
	
	/**
	 * 爬楼梯，一次一层或者两层，利用递归-动态数组求算
	 * @param n
	 * @return
	 */
	public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
       int[] dp = new int[n+1];
       dp[1] = 1;
       dp[2] = 2;
       for (int i = 3; i <= n; i++) {
    	   dp[i] = dp[i-1] + dp[i-2];  
       }
       return dp[n];
       
    }

}

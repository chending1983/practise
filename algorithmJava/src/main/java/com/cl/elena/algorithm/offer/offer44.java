package com.cl.elena.algorithm.offer;

public class offer44 {

	/**
	 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
	 * 
	 * 请写一个函数，求任意第n位对应的数字。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：n = 3 输出：3 示例 2：
	 * 
	 * 输入：n = 11 输出：0  
	 * 
	 * 限制：
	 * 
	 * 0 <= n < 2^31
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer44() {
		// TODO Auto-generated constructor stub
	}
	
	public int findNthDigit(int n) {
		int digit = 1;
		int start = 1;
		int count = 9;
		while (n > count) {
			n -= count;
			digit += 1;
			start *= 10;
			count = digit * start * 9;
		}
		int num = start + (n -1) / digit;
		return Long.toString(num).charAt((n - 1) % digit) - '0';
    }

}

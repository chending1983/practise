package com.cl.elena.algorithm.leetcode;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设s 的最大长度为 1000。
 * 
 * 示例 1：
 * 
 * 输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。 示例 2：
 * 
 * 输入: "cbbd" 输出: "bb"
 */

public class lcode5 {

	public String longestPalindrome(String s) {
		if (s.isEmpty())
			return "";// 字符串为空时，则返回空
		if (s.length() == 1)
			return s;// 字符串长度为1时，返回他本身
		int start = 0, maxlength = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				int temp1, temp2;
				// 对每个字符串都从两边开始向中间遍历
				for (temp1 = i, temp2 = j; temp1 < temp2; temp1++, temp2--) {
					if (s.charAt(temp1) != s.charAt(temp2))
						break;
				}
				// 若temp1=temp2,表示串是类似于abcba这种类型；若大于，则是abccba这种类型
				if (temp1 >= temp2 && j - i + 1 > maxlength) {
					maxlength = j - i + 1;
					start = i;
				}
			}
		}
		return s.substring(start, start + maxlength);
	}

	public static void main(String[] args) {

	}
}
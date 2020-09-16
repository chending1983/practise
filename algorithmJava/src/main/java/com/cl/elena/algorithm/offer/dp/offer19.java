package com.cl.elena.algorithm.offer.dp;

public class offer19 {
	/**
	 * 请实现一个函数用来匹配包含'.'和'*'的正则表达式。 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
	 * 在本题中，匹配是指字符串的所有字符匹配整个模式。 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
	 * 
	 * 示例 1: 输入: s = "aa" p = "a" 输出: false 解释: "a" 无法匹配 "aa" 整个字符串。
	 * 
	 * 示例 2: 输入: s = "aa" p = "a*" 输出: true 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素,
	 * 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
	 * 
	 * 示例 3: 输入: s = "ab" p = ".*" 输出: true 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
	 * 
	 * 示例 4: 输入: s = "aab" p = "c*a*b" 输出: true 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a'
	 * 被重复一次。因此可以匹配字符串 "aab"。
	 * 
	 * 示例 5: 输入: s = "mississippi" p = "mis*is*p*." 输出: false
	 * s 可能为空，且只包含从 a-z 的小写字母。 p 可能为空，且只包含从 a-z 的小写字母以及字符 . 和 *，无连续的 '*'。
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/zheng-ze-biao-da-shi-pi-pei-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 
	 * @param args
	 */
	public boolean isMatch(String s, String p) {
		int slength = s.length();
		int plength = p.length();
		boolean[][] ret = new boolean[slength+1][plength+1];
		for (int n =0; n <= slength; n++) {
			for (int m =0; m <= plength; m++) {
				if (m == 0) {
					ret[n][m] = n == 0;
				} else {
					//非空正则分为两种情况 * 和 非*
					if (p.charAt(m - 1) != '*') {
						if (n > 0 && (s.charAt(n - 1) == p.charAt(m - 1) || p.charAt(m - 1) == '.')) {
                            ret[n][m] = ret[n - 1][m - 1];
                        }
					} else {
						//碰到 * 了，分为看和不看两种情况
                        //不看
                        if (m >= 2) {
                            ret[n][m] |= ret[n][m - 2];
                        }
                        //看
                        if (n >= 1 && m >= 2 && (s.charAt(n - 1) == p.charAt(m - 2) || p.charAt(m - 2) == '.')) {
                            ret[n][m] |= ret[n - 1][m];
                        }
					}
				}
			}
		}
		return ret[slength][plength];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

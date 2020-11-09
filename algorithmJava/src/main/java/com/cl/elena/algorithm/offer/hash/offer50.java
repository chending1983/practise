package com.cl.elena.algorithm.offer.hash;

import java.util.LinkedHashMap;
import java.util.Map;

public class offer50 {

	/**
	 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
	 * 
	 * 示例:
	 * 
	 * s = "abaccdeff" 返回 "b"
	 * 
	 * s = "" 返回 " "  
	 * 
	 * 限制：
	 * 
	 * 0 <= s 的长度 <= 50000
	 * 
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer50() {
		// TODO Auto-generated constructor stub
	}

	public char firstUniqChar(String s) {
		Map<Character, Boolean> dic = new LinkedHashMap<>();
		char[] sc = s.toCharArray();
		for (char c : sc) {
			dic.put(c, !dic.containsKey(c));
		}
		for (Map.Entry<Character, Boolean> d : dic.entrySet()) {
			if (d.getValue())
				return d.getKey();
		}
		return ' ';

	}

}
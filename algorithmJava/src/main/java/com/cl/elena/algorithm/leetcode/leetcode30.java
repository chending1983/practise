package com.cl.elena.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode30 {
	/**
	 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
	 * 
	 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入： s = "barfoothefoobarman", words = ["foo","bar"] 输出：[0,9] 解释： 从索引 0 和 9
	 * 开始的子串分别是 "barfoo" 和 "foobar" 。 输出的顺序不重要, [9,0] 也是有效答案。 示例 2：
	 * 
	 * 输入： s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
	 * 输出：[]
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 
	 * @param args
	 */
	public static List<Integer> findSubstring(String s, String[] words) {
		if ( s==null || "".equals(s) || words == null || words.length == 0)
			return null;
		List<Integer> res = new ArrayList<>();
		int wordlength = words[0].length();
		int wordnumber = words.length;
		Map<String, Integer> basewordMap = new HashMap<String, Integer>();
		for (String word : words) {
			basewordMap.put(word, basewordMap.getOrDefault(word, 0) + 1);
		}
		for (int i = 0; i < wordlength; i++) {
			int left = i, right = i, count = 0;
			HashMap<String, Integer> tmp_map = new HashMap<>();
			while (right + wordlength <= s.length()) {
				String w = s.substring(right, right + wordlength);
				right += wordlength;
				if (!basewordMap.containsKey(w)) {
					count = 0;
					left = right;
                    tmp_map.clear();
				} else {
					tmp_map.put(w, tmp_map.getOrDefault(w, 0) + 1);
                    count++;
					while (tmp_map.getOrDefault(w, 0) > basewordMap.getOrDefault(w, 0)) {
						String t_w = s.substring(left, left + wordlength);
						count--;
						tmp_map.put(t_w, tmp_map.getOrDefault(t_w, 0) - 1);
						left += wordlength;
					}
					if (count == wordnumber)
						res.add(left);
				}
				
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String string = "wordgoodgoodgoodbestword";
		String[] wordStrings = {"word","good","best","word"};
		System.out.println(findSubstring(string, wordStrings));
	}

}

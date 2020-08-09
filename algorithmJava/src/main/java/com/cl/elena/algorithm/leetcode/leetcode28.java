package com.cl.elena.algorithm.leetcode;

/**
 * 实现 strStr() 函数。
 * 
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置
 * (从0开始)。如果不存在，则返回  -1。
 * 
 * 示例 1:
 * 
 * 输入: haystack = "hello", needle = "ll" 输出: 2 示例 2:
 * 
 * 输入: haystack = "aaaaa", needle = "bba" 输出: -1 说明:
 * 
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode28 {

    public int strStr(String haystack, String needle) {
        int result = -1;
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        // 如果目标字符串为空 返回0
        if (needleChar.length == 0) {
            return 0;
        }

        for (int i = 0; i < haystackChar.length;) {
            if (haystackChar[i] == needleChar[0]) {
                // 如果源字符当前索引后面的长度没有目标字符串长 则不匹配,跳过当前循环
                if (i + needleChar.length > haystackChar.length) {
                    continue;
                }
                for (int j = 0; j < needleChar.length; j++) {
                    result = i;
                    if (haystackChar[i + j] != needleChar[j]) {
                        result = -1;
                        break;
                    }
                }
                if (result > -1) {
                    return result;
                }
            }

        }
        return result;
    }

}
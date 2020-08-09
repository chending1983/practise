package com.cl.elena.algorithm.leetcode;

import java.util.HashMap;

class leetcode340 {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
        int result = 0;
        int left = 0;
        // 声明一个HashMap，用来存储k Distinct，还可以根据value用来判断元素是否可以删除
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            // 右指针依次把字符串中的字符放到map中
            map.put(s.charAt(right), right);
            // 当map元素大于k Distinct时，得到满足要求的子字符串
            while (map.size() > k) {
                // 删除最左的字符，删除成功，则退出循环
                char leftChar = s.charAt(left);
                System.out.println(leftChar);
                if (map.get(leftChar) == left) {
                    System.out.println("delete:" +leftChar);
                    map.remove(leftChar);
                }
                // 左指针右移
                left++;
            }
            // 子结果即左右指针之间的长度
            int subResult = right - left + 1;
            // 结果取最大
            result = Math.max(result, subResult);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ecebace";
        int k = 3;
        int len = lengthOfLongestSubstringKDistinct(str, k);
        System.out.println("length is : = " + len);
    }
}
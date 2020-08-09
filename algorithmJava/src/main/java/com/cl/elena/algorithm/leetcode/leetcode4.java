package com.cl.elena.algorithm.leetcode;

import java.util.HashMap;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 
 * 示例 1:
 * 
 * nums1 = [1, 3] nums2 = [2]
 * 
 * 则中位数是 2.0 示例 2:
 * 
 * nums1 = [1, 2] nums2 = [3, 4]
 * 
 * 则中位数是 (2 + 3)/2 = 2.5
 * 
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}
		// 5,10
		int m = nums1.length, n = nums2.length;
		// 8
		int totalLeft = (m + n + 1) / 2;
		int left = 0;
		int right = m;
		while (left < right) {
			// 3 4
			int i = left + (right - left + 1) / 2;
			// 5 4
			int j = totalLeft - i;
			if (nums1[i - 1] > nums2[j]) {
				right = i - 1;
			} else {
				// 3
				left = i;
			}
		}
		int i = left;
		int j = totalLeft - i;
		int nums1leftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
		int nums1rightMin = i == m ? Integer.MAX_VALUE : nums1[i];
		int nums2leftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
		int nums2rightMin = j == n ? Integer.MAX_VALUE : nums2[j];

		if ((m + n) % 2 == 1) {
			return (double) Math.max(nums1leftMax, nums2leftMax);
		} else {
			return (double) (Math.min(nums1rightMin, nums2rightMin) + Math.max(nums1leftMax, nums2leftMax)) / 2;
		}
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

	}
}
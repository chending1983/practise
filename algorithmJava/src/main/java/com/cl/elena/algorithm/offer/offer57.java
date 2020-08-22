package com.cl.elena.algorithm.offer;

import java.util.ArrayList;
import java.util.List;

public class offer57 {

	/**
	 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：nums = [2,7,11,15], target = 9 输出：[2,7] 或者 [7,2] 示例 2：
	 * 
	 * 输入：nums = [10,26,30,31,47,60], target = 40 输出：[10,30] 或者 [30,10]  
	 * 
	 * 限制：
	 * 
	 * 1 <= nums.length <= 10^5 1 <= nums[i] <= 10^6
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer57() {
		// TODO Auto-generated constructor stub
	}

	public int[] twoSum(int[] nums, int target) {
		int i = 0, j = nums.length - 1;
		while (i < j) {
			int compare = nums[i] + nums[j];
			if (compare < target) {
				i++;
			} else if (compare > target) {
				j--;
			} else {
				return new int[] { nums[i], nums[j] };
			}
		}
		return new int[0];
	}

	/**
	 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
	 * 
	 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：target = 9 输出：[[2,3,4],[4,5]] 示例 2：
	 * 
	 * 输入：target = 15 输出：[[1,2,3,4,5],[4,5,6],[7,8]]  
	 * 
	 * 限制：
	 * 
	 * 1 <= target <= 10^5
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 
	 * @param target
	 * @return
	 */
	public int[][] findContinuousSequence(int target) {
		int left = 1, right = 1;
		int sum = 0;
	    List<int[]> res = new ArrayList<>();
	    while(left <= target / 2) {
	    	
	    	if (sum < target) {
	    		sum += right;
	    		right++;
	    	} else if (sum > target) {
	    		sum -=left;
	    		left++;
	    	} else {
	            int[] arr = new int[right-left];
	            for (int k = left; k < right; k++) {
	                arr[k-left] = k;
	            }
	            res.add(arr);
	            sum -= left;
	            left++;
	    	}
	    	
	    }
	    return res.toArray(new int[res.size()][]);
	}

}

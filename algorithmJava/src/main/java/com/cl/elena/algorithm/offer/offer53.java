package com.cl.elena.algorithm.offer;

public class offer53 {

	/**
	 * 
	 * 统计一个数字在排序数组中出现的次数。
	 * 
	 * 
	 * 
	 * 示例 1:
	 * 
	 * 输入: nums = [5,7,7,8,8,10], target = 8 输出: 2 示例 2:
	 * 
	 * 输入: nums = [5,7,7,8,8,10], target = 6 输出: 0
	 * 
	 * 
	 * 限制：
	 * 
	 * 0 <= 数组长度 <= 50000
	 */
	public offer53() {
		// TODO Auto-generated constructor stub
	}
	
	int cnt = 0;  
	public int search(int[] nums, int target) {
		helper(nums, target, 0, nums.length -1);
		return cnt;
    }
	
	void helper(int[] nums, int target, int low, int high) {
		if (low <= high) {
			int mid = (high - low) /2 + low;
			if (nums[mid] == target) {
				cnt++;
				helper(nums, target, low, mid - 1);
				helper(nums, target, mid + 1, high);
			} else if (nums[mid] > target) {
				helper(nums, target, low, mid - 1);				
			} else {
				helper(nums, target, mid + 1, high);
			}
		}
	}
	
	 public int missingNumber(int[] nums) {
		 int i = 0, j = nums.length - 1;
		 while (i <= j) {
			 int mid = (i + j) / 2;
			 if (nums[mid] == mid) {
				 i = mid + 1;
			 } else {
				 j = mid - 1;
			 }
		 }
		 return i;
	 }
	

}

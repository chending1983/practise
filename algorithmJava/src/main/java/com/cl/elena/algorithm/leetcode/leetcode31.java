package com.cl.elena.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode31 {
	/**
	 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
	 * 
	 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
	 * 
	 * 必须原地修改，只允许使用额外常数空间。
	 * 
	 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。 
	 * 1,2,3 → 1,3,2 
	 * 3,2,1 → 1,2,3 
	 * 1,1,5 → 1,5,1
	 * 1,5,1 → 5,1,1
	 * 1,2,3,4  1,2,4,3
	 * 1,2,4,3  1,3,4,2
	 * 这理解起来真特么的费劲啊，看了评论之后才看明白，先理解题目的意思，
	 * 给出的数组，组成一个数字是123，找出这三个数字组合当中，比123大的下一个数字。
	 * ps：字典序排序可考察的地方还是很多的。
	 * 
	 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/next-permutation
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 题解思路：
	 *  首先从后向前查找第一个相邻升序的元素对 (i,j)。这里 i=4，j=5，对应的值为 5，7：
	 *  然后在 [j,end) 从后向前查找第一个大于 A[i] 的值 A[k]。这里 A[i] 是 5，故 A[k] 是 6：
	 *  将 A[i] 与 A[k] 交换。这里交换 5、6：
	 *  这时 [j,end) 必然是降序，逆置 [j,end)，使其升序。这里逆置 [7,5,4]：
	 *  因此，12385764 的下一个排列就是 12386457。
	 * 
	 * @param args
	 */
	public void nextPermutation(int[] nums) {
		int arraylength = nums.length - 1;
		for (int i = arraylength - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int j = nums.length - 1;
                for (; j > i && nums[j] <= nums[i]; j--) ;
                exch(nums, i, j);
                reverse(nums, i + 1, arraylength);
                return;
            }
        }
    }
	private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int lo, int hi){
        while(lo < hi){
            exch(nums, lo++, hi--);
        }
    }
	
    
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int n = 0; n < matrix.length -1; n++) {
            for (int m = 0; m <matrix[n].length -1; m++ ) {
                if (matrix[n][m] > target) {
                    continue;
                } else {
                    if (matrix[n][m] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		
	}

}

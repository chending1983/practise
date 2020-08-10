package com.cl.elena.algorithm.offer;

public class offer29 {

	/**
	 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]] 输出：[1,2,3,6,9,8,7,4,5] 示例 2：
	 * 
	 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
	 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]  
	 * 
	 * 限制：
	 * 
	 * 0 <= matrix.length <= 100 0 <= matrix[i].length <= 100
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer29() {
		// TODO Auto-generated constructor stub
	}

	public int[] spiralOrder(int[][] matrix) {
		if (matrix.length == 0) {
			return new int[0];
		}
		int rows = matrix.length, columns = matrix[0].length;
		int[] order = new int[rows * columns];
		int index = 0;
		int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
		while (left <= right && top <= bottom) {
			for (int column = left; column <= right; column++) {
				order[index++] = matrix[top][column];
			}
			for (int row = top; row <= bottom; row++) {
				order[index++] = matrix[row][right];
			}
			if (left < right && top < bottom) {
				for (int column = right - 1; column > left; column--) {
					order[index++] = matrix[bottom][column];
				}
				for (int row = bottom; row > top; row--) {
					order[index++] = matrix[row][left];
				}
			}
			left++;
			right--;
			top++;
			bottom--;
		}
        return order;
	}
}
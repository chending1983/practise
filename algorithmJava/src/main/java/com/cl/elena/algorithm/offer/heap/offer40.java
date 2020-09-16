package com.cl.elena.algorithm.offer.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class offer40 {

	/**
	 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：arr = [3,2,1], k = 2 输出：[1,2] 或者 [2,1] 示例 2：
	 * 
	 * 输入：arr = [0,1,2,1], k = 1 输出：[0]  
	 * 
	 * 限制：
	 * 
	 * 0 <= k <= arr.length <= 10000 0 <= arr[i] <= 10000
	 * 
	 * 
	 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer40() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] getLeastNumbers(int[] arr, int k) {
		if (k == 0) {
	        return new int[0];
	    }
	    Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
		for (int element : arr) {
	        if (heap.isEmpty() || heap.size() < k || element < heap.peek()) {
	            heap.offer(element);
	        }
	        if (heap.size() > k) {
	            heap.poll(); // 删除堆顶最大元素
	        }
		}
	    // 将堆中的元素存入数组
	    int[] res = new int[heap.size()];
	    int j = 0;
	    for (int e : heap) {
	        res[j++] = e;
	    }
	    return res;
    }

}

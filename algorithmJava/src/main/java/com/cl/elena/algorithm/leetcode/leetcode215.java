package com.cl.elena.algorithm.leetcode;

import java.util.PriorityQueue;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,1,5,6,4] 和 k = 2 输出: 5 示例 2:
 * 
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4 输出: 4 说明:
 * 
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * 
 * 
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode215 {

    // 建立K个元素的大顶堆，顶堆的元素就是需要的结果
    public int findKthLargest(int[] nums, int k) {
                // init heap 'the smallest element first'
                PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
    
            // keep k largest elements in the heap
            for (int n: nums) {
              heap.add(n);
              if (heap.size() > k)
                heap.poll();
            }
    
            // output
            return heap.poll();
    }
}
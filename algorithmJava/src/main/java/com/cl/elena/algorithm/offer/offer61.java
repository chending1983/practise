package com.cl.elena.algorithm.offer;

import java.util.HashSet;
import java.util.Set;

public class offer61 {

	public offer61() {
		// TODO Auto-generated constructor stub
	}

	public boolean isStraight(int[] nums) {
		Set<Integer> repeat = new HashSet<>();
		int max = 0, min = 14;
		for (int num : nums) {
			if (num == 0)
				continue;
			max = Math.max(max, num); // 最大牌
			min = Math.min(min, num);
			if (repeat.contains(num))
				return false; // 若有重复，提前返回 false
			repeat.add(num); // 添加此牌至 Set
		}
		return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
	}
}

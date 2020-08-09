package com.cl.elena.algorithm.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class offer59 {
	Queue<Integer> queue;
	Deque<Integer> deque;

	public offer59() {
		queue = new LinkedList<>(); // 队列：插入和删除
		deque = new LinkedList<>(); // 双端队列：获取最大值
	}

	public int max_value() {
		return deque.size() > 0 ? deque.peek() : -1;
	}

	public void push_back(int value) {
		queue.offer(value);
		while (deque.size() > 0 && deque.peekLast() < value) {
			deque.pollLast(); // 将deq队尾小于value的元素删掉
		}
		deque.offer(value);
	}

	public int pop_front() {
		int tmp = queue.size() > 0 ? queue.poll() : -1; // 获得队首元素
		if (deque.size() > 0 && deque.peek().equals(tmp)) {
			deque.poll(); // 如果出队的元素是当前最大值，将deq的队首出队
		}
		return tmp;
	}
}

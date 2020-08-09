package com.cl.elena.algorithm.offer;

import java.util.Deque;
import java.util.Stack;

public class offer09 {

	public offer09() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 插入元素
	 * 
	 * 插入元素对应方法 appendTail
	 * 
	 * stack1 直接插入元素 删除元素
	 * 
	 * 删除元素对应方法 deleteHead
	 * 
	 * 如果 stack2 为空，则将 stack1 里的所有元素弹出插入到 stack2 里 如果 stack2 仍为空，则返回 -1，否则从 stack2
	 * 弹出一个元素并返回
	 */
	Stack<Integer> stack1;
	Stack<Integer> stack2;

	public void appendTail(int value) {
		stack1.push(value);
	}

	public int deleteHead() {
		if (stack2.empty()) {
			while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
		} 
		if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
	}
}

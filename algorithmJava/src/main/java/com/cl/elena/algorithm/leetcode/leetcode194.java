package com.cl.elena.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode194 {

	class Node {
		int Key;
		int Value;
		Node preNode;
		Node nextNode;

		public Node() {

		}

		public Node(int _key, int _value) {
			Key = _key;
			Value = _value;
		}
	}

	private Map<Integer, Node> cache = new HashMap<Integer, Node>();
	private int size;
	private int capacity;
	private Node head, tail;

	public leetcode194(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		// 使用伪头部和伪尾部节点
		head = new Node();
		tail = new Node();
		head.nextNode = tail;
		tail.preNode = head;
	}

	public int get(int key) {
		Node node = cache.get(key);
		if (node == null) {
			return -1;
		}
		// TODO:调整到头位置
		moveToHead(node);
		return node.Value;

	}

	public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点
        	Node newNode = new Node(key, value);
            // 添加进哈希表
            cache.put(key, newNode);
            // 添加至双向链表的头部
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点
            	Node tail = removeTail();
                // 删除哈希表中对应的项
                cache.remove(tail.Key);
                --size;
            }
        }
        else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.Value = value;
            moveToHead(node);
        }
	}
	
	private void addToHead (Node node) {
		node.preNode = head;
		node.nextNode = head.nextNode;
		head.nextNode.preNode = node;
		head.nextNode = node;
	}
	
	private void removeNode(Node node) {
		node.preNode.nextNode = node.nextNode;
		node.nextNode.preNode = node.preNode;
	}

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private Node removeTail() {
        Node res = tail.preNode;
        removeNode(res);
        return res;
    }
}

package com.cl.elena.algorithm.offer.link;

import java.util.HashMap;
import java.util.Map;

public class offer35 {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}

	}

	/**
	 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random
	 * 指针指向链表中的任意节点或者 null。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 
	 * 
	 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
	 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]] 示例 2：
	 * 
	 * 
	 * 
	 * 输入：head = [[1,1],[2,1]] 输出：[[1,1],[2,1]] 示例 3：
	 * 
	 * 
	 * 
	 * 输入：head = [[3,null],[3,0],[3,null]] 输出：[[3,null],[3,0],[3,null]] 示例 4：
	 * 
	 * 输入：head = [] 输出：[] 解释：给定的链表为空（空指针），因此返回 null。  
	 * 
	 * 提示：
	 * 
	 * -10000 <= Node.val <= 10000 Node.random 为空（null）或指向链表中的节点。 节点数目不超过 1000 。
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer35() {
		// TODO Auto-generated constructor stub
	}

	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<>();
		Node cur=head;
		while (cur != null) {
			map.put(cur, new Node(cur.val));
			cur = cur.next;
		}
        cur = head;
        while(cur!=null){
            //得到get:<key>.value2,3
            map.get(cur).next = map.get(cur.next); //新结点next指向同旧结点的next指向
            map.get(cur).random = map.get(cur.random); //新结点random指向同旧结点的random指向
            cur = cur.next;
        }
        //返回复制的链表
        return map.get(head);
	}
}

package com.cl.elena.algorithm.offer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32 {

	/**
	 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
	 * 
	 *  
	 * 
	 * 例如: 给定二叉树: [3,9,20,null,null,15,7],
	 * 
	 * 3 / \ 9 20 / \ 15 7 返回：
	 * 
	 * [3,9,20,15,7]  
	 * 
	 * 提示：
	 * 
	 * 节点总数 <= 1000
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer32() {
		// TODO Auto-generated constructor stub
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int[] levelOrder(TreeNode root) {
		if (root == null)
			return new int[0];
		Queue<TreeNode> queue = new LinkedList() {
			{
				add(root);
			}
		};
		ArrayList<Integer> ans = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			ans.add(node.val);
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
		int[] res = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++)
			res[i] = ans.get(i);
		return res;
	}
	
	public List<List<Integer>> levelOrderToArray(TreeNode root) {
		if (root == null)
			return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
            	TreeNode node = queue.poll();
            	tmp.add(node.val);
            	if (node.left != null) queue.add(node.left);
            	if (node.right != null) queue.add(node.right); 
            }
            res.add(tmp);
        }
        return res;
	}
	
	public List<List<Integer>> leveLists(TreeNode root) {
		  Queue<TreeNode> queue = new LinkedList<>();
	        List<List<Integer>> res = new ArrayList<>();
	        if(root != null) queue.add(root);
	        while(!queue.isEmpty()) {
	            LinkedList<Integer> tmp = new LinkedList<>();
	            for(int i = queue.size(); i > 0; i--) {
	                TreeNode node = queue.poll();
	                if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
	                else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
	                if(node.left != null) queue.add(node.left);
	                if(node.right != null) queue.add(node.right);
	            }
	            res.add(tmp);
	        }
	        return res;
	}


}

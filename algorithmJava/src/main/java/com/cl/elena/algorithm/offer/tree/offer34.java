package com.cl.elena.algorithm.offer.tree;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.cl.elena.algorithm.offer.tree.offer32.TreeNode;

public class offer34 {

	/**
	 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
	 * 
	 *  
	 * 
	 * 示例: 给定如下二叉树，以及目标和 sum = 22，
	 * 
	 * 5 / \ 4 8 / / \ 11 13 4 / \ / \ 7 2 5 1 返回:
	 * 
	 * [ [5,4,11,2], [5,8,4,5] ]  
	 * 
	 * 提示：
	 * 
	 * 节点总数 <= 10000
	 * 
	 * 
	 * 来源：力扣（LeetCode）
	 * 链接：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	public offer34() {
	}
	List<List<Integer>> resList = new ArrayList();
    LinkedList<Integer> path = new LinkedList<>(); 
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return resList;
    }
	
	void recur(com.cl.elena.algorithm.offer.tree.offer32.TreeNode root, int sum) {
		 	if (root == null) return;
		 	path.add(root.val);
		 	sum -= root.val;
		 	if (sum ==0 && root.left == null && root.right == null) {
		 		resList.add(new LinkedList(path));
		 	}
		 	recur(root.left, sum);
		 	recur(root.right, sum);
		 	path.removeLast();
	}

}

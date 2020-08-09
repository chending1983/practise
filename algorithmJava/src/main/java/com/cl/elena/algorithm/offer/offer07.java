package com.cl.elena.algorithm.offer;

import java.util.HashMap;

public class offer07 {

	public offer07() {
		// TODO Auto-generated constructor stub
	}
	HashMap<Integer, Integer> dic = new HashMap<>();
    int[] po;
    
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		po = preorder;
		for (int i = 0; i < inorder.length; i ++) {
			dic.put(inorder[i], i);
		}
		return recur(0, 0, inorder.length - 1);
	}
	
	private TreeNode recur(int root, int left,int right) {
		if (left > right) {
			return null;
		}
		TreeNode node = new TreeNode(po[root]);
		int i = dic.get(po[root]);
		node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
		return node;
	}

}

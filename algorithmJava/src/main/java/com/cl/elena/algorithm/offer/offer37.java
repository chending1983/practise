package com.cl.elena.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class offer37 {

	public offer37() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	public String serialize(TreeNode root) {
		if (root == null) {
			return "[]";
		}
		StringBuilder stringBuilder = new StringBuilder();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		stringBuilder.append("[" + root.val);
		while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.left != null) {
                queue.offer(tmp.left);
                stringBuilder.append(",");
                stringBuilder.append(tmp.left.val);
            } else {
            	stringBuilder.append(",null");
            }
            // 上面处理left，下面处理right
            if (tmp.right != null) {
                queue.offer(tmp.right);
                stringBuilder.append(",");
                stringBuilder.append(tmp.right.val);
            } else {
            	stringBuilder.append(",null");
            }
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data.length() == 2) {
            return null;
        }
        data = data.substring(1, data.length() - 1);
		String[] vals = data.split(",");
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
        queue.offer(root); // 第一个元素为root节点
        int i = 1; // 标记后续处理的节点值（包含null）
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            // 从队列中取出节点，然后根据是否为null，依次设置left和right
            // 如果不是null，则需要加入队列，后续需要处理此有效节点的左右节点
            if (vals[i].equals("null")) {
                tmp.left = null;
            } else {
                tmp.left = new TreeNode(Integer.valueOf(vals[i]));
                queue.offer(tmp.left);
            }
            i++;
            if (vals[i].equals("null")) {
                tmp.right = null;
            } else {
                tmp.right = new TreeNode(Integer.valueOf(vals[i]));
                queue.offer(tmp.right);
            }
            i++;
        }
		return root;
	}

	// Your Codec object will be instantiated and called as such:
	// Codec codec = new Codec();
	// codec.deserialize(codec.serialize(root));

}

package com.cl.elena.algorithm.leetcode;




class leetcode98 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public boolean helper(TreeNode node, Integer minvalue, Integer maxvalue) {
        if (node == null) return true;
    
        int val = node.val;
        if (minvalue != null && val <= minvalue) return false;
        if (maxvalue != null && val >= maxvalue) return false;
    
        if (! helper(node.right, val, maxvalue)) return false;
        if (! helper(node.left, minvalue, val)) return false;
        return true;
      }

    public boolean isValidBST(TreeNode node) {
        return helper(node, null,null) ;
    }

    
}
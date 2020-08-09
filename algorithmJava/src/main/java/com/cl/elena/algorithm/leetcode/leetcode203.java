package com.cl.elena.algorithm.leetcode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
/**
 * 删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 */
class leetcode203 {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static ListNode remoListNode(ListNode head, int value) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode compare = temp;
        while (compare.next != null) {
            if (compare.next.val == value) {
                compare.next = compare.next.next;
            } else {
                compare = compare.next;
            }

        }
        return temp;
    }

    public static void name() {
        ListNode node = new ListNode(8);
        int val = 7;
        System.out.println("return : =  " + removeElements(node, val));
    }
}
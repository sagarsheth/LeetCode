package com.leetcode.sagar;

public class AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode list1 = l1;
		ListNode list2 = l2;
		int carry = 0;
		int result = 0;
		ListNode firstnode = new ListNode(0);
		ListNode curr = firstnode;
		while (list1 != null && list2 != null) {
			result = list1.val + list2.val + carry;
			System.out.print(result + "-> result ");
			carry = 0;
			if (result > 9) {
				result = result - 10;
				carry++;
			}
			curr.next = new ListNode(result);
			curr = curr.next;

			if (list1 != null) {
				list1 = list1.next;
				System.out.print(list1.val + "-> list1.next ");
			}
			if (list2 != null) {
				list2 = list2.next;
				System.out.print(list2.val + "-> list2.next ");
			}
		}
		if (carry != 0) {
			curr.next = new ListNode(result);
		}

		System.out.print("L1: {");
		while (firstnode.next != null) {
			System.out.print(firstnode.val + ", ");
			firstnode = firstnode.next;
		}
		System.out.println(firstnode.val + "}");

		return firstnode.next;
	}
}
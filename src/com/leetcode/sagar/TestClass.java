package com.leetcode.sagar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.leetcode.sagar.AddTwoNumbers.ListNode;

public class TestClass {
	ListNode l1 = null;
	ListNode l2 = null;

	@Before
	public void setUp() {
		// int[] a = { 3, 4, 2 };
		// int[] a = { 5 };
		int[] a = { 1, 8 };
		for (int i = 0; i < a.length; i++) {
			ListNode node1 = new ListNode(a[i]);
			node1.next = l1;
			l1 = node1;
		}

		// int[] b = { 4, 6, 5 };
		// int[] b = { 5 };
		int[] b = { 0 };
		for (int i = 0; i < b.length; i++) {
			ListNode node2 = new ListNode(b[i]);
			node2.next = l2;
			l2 = node2;
		}
		/*
		 * System.out.print("L1: {"); while (l1.next != null) {
		 * System.out.print(l1.val + ", "); l1 = l1.next; }
		 * System.out.println(l1.val + "}");
		 * 
		 * System.out.print("L2: {"); while (l2.next != null) {
		 * System.out.print(l2.val + ", "); l2 = l2.next; }
		 * System.out.print(l2.val + "}");
		 */

	}

	@Test
	public void testAddTwoNumber() {
		Assert.assertEquals(0, AddTwoNumbers.addTwoNumbers(l1, l2));
	}
}

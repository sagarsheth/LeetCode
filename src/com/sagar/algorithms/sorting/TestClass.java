package com.sagar.algorithms.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

	@Before
	public void setUp() {

	}

	@Test
	public void testBubbleSort() {
		int[] input = { 5, 4, 2, 3, 1 };
		int[] result = { 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(result, BubbleSort.bubbleSortMethod(input, false));

		int[] input1 = { 3, 4, 2, 5, 1, 6, 7, 9, 0, 8 };
		int[] result1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Assert.assertArrayEquals(result1, BubbleSort.bubbleSortMethod(input1, false));

		int[] input2 = { 5, 4, 3, 2, 1, 0 };
		int[] result2 = { 0, 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(result2, BubbleSort.bubbleSortMethod(input2, false));

		int[] input3 = { 2, 2, 2, 2, 2, 2, 2 };
		int[] result3 = input3;
		Assert.assertArrayEquals(result3, BubbleSort.bubbleSortMethod(input3, false));

	}

	@Test
	public void testMergeSort() {
		int[] input = { 5, 4, 2, 3, 1 };
		int[] result = { 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(result, MergeSort.mergeSortMethod(input, false));

		int[] input1 = { 3, 4, 2, 5, 1, 6, 7, 9, 0, 8 };
		int[] result1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Assert.assertArrayEquals(result1, MergeSort.mergeSortMethod(input1, false));

		int[] input2 = { 5, 4, 3, 2, 1, 0 };
		int[] result2 = { 0, 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(result2, MergeSort.mergeSortMethod(input2, false));

		int[] input3 = { 2, 2, 2, 2, 2, 2, 2 };
		int[] result3 = input3;
		Assert.assertArrayEquals(result3, MergeSort.mergeSortMethod(input3, false));

	}
}

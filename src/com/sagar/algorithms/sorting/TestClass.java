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

		int[] input4 = { 7, 5, 10, 6, 7, 1, 2, 6, 7, 2, 1 };
		int[] result4 = { 1, 1, 2, 2, 5, 6, 6, 7, 7, 7, 10 };
		Assert.assertArrayEquals(result4, BubbleSort.bubbleSortMethod(input4, false));

	}

	@Test
	public void testMergeSortedArray() {

		int[] input1 = { 3, 5, 8, 9 };
		int[] input2 = { 2, 4, 7, 10 };
		int[] result = { 2, 3, 4, 5, 7, 8, 9, 10 };
		Assert.assertArrayEquals(result, MergeSort.mergeSortedArrays(input1, input2, false));

		int[] input11 = { 3, 5, 8, 9 };
		int[] input12 = { 2, 4 };
		int[] result1 = { 2, 3, 4, 5, 8, 9 };
		Assert.assertArrayEquals(result1, MergeSort.mergeSortedArrays(input11, input12, false));
		Assert.assertArrayEquals(result1, MergeSort.mergeSortedArrays(input12, input11, false));

		int[] input21 = { 3, 5, 8, 9 };
		int[] input22 = { 2, 4 };
		int[] result2 = { 2, 3, 4, 5, 8, 9 };
		Assert.assertArrayEquals(result2, MergeSort.mergeSortedArrays(input21, input22, false));
		Assert.assertArrayEquals(result2, MergeSort.mergeSortedArrays(input22, input21, false));

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

		int[] input4 = { 7, 5, 10, 6, 7, 1, 2, 6, 7, 2, 1 };
		int[] result4 = { 1, 1, 2, 2, 5, 6, 6, 7, 7, 7, 10 };
		Assert.assertArrayEquals(result4, MergeSort.mergeSortMethod(input4, false));

	}

}

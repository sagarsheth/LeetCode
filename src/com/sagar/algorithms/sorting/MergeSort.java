package com.sagar.algorithms.sorting;

public class MergeSort {

	public static int[] mergeSortMethod(int[] input, boolean debug) {
		int result[] = new int[input.length];

		return result;
	}

	public static int[] mergeSortedArrays(int[] input1, int[] input2) {
		int[] result = new int[input1.length + input2.length];
		int pointer1 = 0;
		int pointer2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (input1[pointer1] <= input2[pointer2]) {
				pointer1++;
			} else {
				pointer2++;
			}
		}
		return result;
	}

}

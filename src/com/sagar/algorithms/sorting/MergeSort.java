package com.sagar.algorithms.sorting;

public class MergeSort extends SortBase {

	public static int[] mergeSortMethod(int[] input, boolean debug) {
		if (input.length <= 1) {
			return input;
		}
		int midPoint = input.length / 2;
		int[] left = new int[midPoint];
		int[] right = new int[input.length - midPoint];

		if (debug) {
			System.out.print("Input :: ");
			printArray(input, debug);
			System.out.println("MidPoint :: " + midPoint);
		}
		for (int i = 0; i < input.length; i++) {
			if (i < midPoint) {
				left[i] = input[i];
			} else {
				right[i - midPoint] = input[i];
			}
		}
		if (debug) {
			System.out.print("Left Array :: ");
			printArray(left, debug);
			System.out.print("Right Array :: ");
			printArray(right, debug);
			System.out.print("--------------------------------------------------------------------------");
			System.out.println("\n");
		}
		int[] result = new int[input.length];
		left = mergeSortMethod(left, debug);
		right = mergeSortMethod(right, debug);
		result = mergeSortedArrays(left, right, debug);
		if (debug) {
			System.out.print("Result Array :: ");
			printArray(result, debug);
			System.out.println("--------------------------------------------------------------------------");
		}
		return result;
	}

	public static int[] mergeSortedArrays(int[] input1, int[] input2, boolean debug) {

		if (input1.length == 0) {
			return input2;
		}
		if (input2.length == 0) {
			return input1;
		}
		int[] result = new int[input1.length + input2.length];
		int pointer1 = 0;
		int pointer2 = 0;
		if (debug) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>> START MEARGING SPRTED ARRAYS <<<<<<<<<<<<<<<<<<<<");
			System.out.print("Input 1 :: ");
			printArray(input1, debug);
			System.out.print("Input 2 :: ");
			printArray(input2, debug);
		}
		for (int i = 0; i < result.length; i++) {
			if (debug) {
				System.out.println("pointer1 :: " + pointer1);
				System.out.println("pointer2 :: " + pointer2);
			}
			if (pointer1 < input1.length && pointer2 < input2.length) {
				if ((input1[pointer1] <= input2[pointer2])) {
					result[i] = input1[pointer1];
					pointer1++;
				} else {
					result[i] = input2[pointer2];
					pointer2++;
				}
			} else if (pointer1 < input1.length) {
				result[i] = input1[pointer1];
				pointer1++;
			} else {
				result[i] = input2[pointer2];
				pointer2++;
			}

			if (debug) {
				System.out.print("Result Step " + (i + 1) + " :: ");
				printArray(result, debug);
			}
		}
		if (debug)
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>> END MEARGING SPRTED ARRAYS <<<<<<<<<<<<<<<<<<<<");
		return result;
	}

}

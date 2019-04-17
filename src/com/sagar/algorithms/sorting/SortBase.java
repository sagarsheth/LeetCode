package com.sagar.algorithms.sorting;

public class SortBase {

	public static void printArray(int[] input, boolean debug) {
		if (debug) {
			for (int i = 0; i < input.length; i++) {
				System.out.print("| " + input[i] + " |");
			}
			System.out.println("");
			System.out.println("");
		}
	}
}

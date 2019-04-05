package com.sagar.algorithms.sorting;

public class BubbleSort {

	public static int[] bubbleSortMethod(int[] input, boolean debug) {
		int[] value = input;
		printArray(input, debug);
		int itrations = 0;
		for (int j = 1; j < input.length; j++) {
			if (debug)
				System.out.println("Set :: " + j);

			for (int i = 0; i < input.length - j; i++) {
				if (debug)
					System.out.println("Itration :: " + (i + 1));
				itrations++;
				if (input[i] > input[i + 1]) {
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
				printArray(input, debug);
			}
		}
		System.out.println("Total Itration needed to perform bubble sort on given input is :: " + itrations);
		return input;
	}

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

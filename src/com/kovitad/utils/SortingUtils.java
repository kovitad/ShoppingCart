package com.kovitad.utils;

import java.util.Arrays;

public class SortingUtils {

	public static void bubbleSort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[j - 1] > input[j]) {
					swapIt(input, j - 1, j);
				}
			}
		}

	}

	public static void selectionSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int expectedMininumIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[expectedMininumIndex] > input[j]) {
					swapIt(input, expectedMininumIndex, j);
					expectedMininumIndex = j;
				}
			}
		}
	}

	public static int[] mergeSort(int[] input) {
		if (input.length > 1) {
			// divide and conquer ... until sorted
			int[] left = Arrays.copyOfRange(input, 0, input.length / 2);
			int[] right = Arrays.copyOfRange(input, left.length, input.length);
			// now divide again using recursive ...
			merge(mergeSort(left), mergeSort(right), input);
			
		}
		return input;
	

	}

	
	
	
	public static void merge(int[] left, int[] right, int[] input) {
		
		int leftSideIndex = 0;
		
		int rightSideIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			/*
			System.out.println("left length:"+left.length);
			System.out.println("leftSideIndex:"+leftSideIndex);
			System.out.println("right length:"+right.length);
			System.out.println("rightSideIndex:"+rightSideIndex);
			*/
			if (rightSideIndex >= right.length 
					|| (leftSideIndex < left.length && left[leftSideIndex] <= right[rightSideIndex] )) {
				// Take from left
				input[i] = left[leftSideIndex];
				leftSideIndex++;
			} else {
				// Take from right
				input[i] = right[rightSideIndex];
				rightSideIndex++;
			}
			
			/*
			if (rightSideIndex >= right.length || (leftSideIndex < left.length && 
                    left[leftSideIndex] <= right[rightSideIndex])) {
				input[i] = left[leftSideIndex];    // take from left
				leftSideIndex++;
            } else {
            	input[i] = right[rightSideIndex];   // take from right
                rightSideIndex++;
            }*/

		}
		
	}

	
	public static void quickSort(int[] input) {
		
		int partitionIndex = 0;
		
		//divide and conquer for the partition
		
		
		
	}
	
	
	/**
	 * 
	 * @param input
	 * @param x
	 * @param y
	 */
	public static void swapIt(int[] input, int x, int y) {
		int temp = input[x];
		input[x] = input[y];
		input[y] = temp;
	}

	public static void main(String[] argv) {
		int[] test = new int[] { 5, 11, 7, 2, 9, 1, 0, 6, 8, 3 };
		// This O(n2)
		mergeSort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i] + ",");
		}
	}

}

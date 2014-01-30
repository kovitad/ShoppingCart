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
					expectedMininumIndex = j;
				}
			}
			swapIt(input, expectedMininumIndex, i);
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
			if (rightSideIndex >= right.length
					|| (leftSideIndex < left.length && left[leftSideIndex] <= right[rightSideIndex])) {
				// Take from left
				input[i] = left[leftSideIndex];
				leftSideIndex++;
			} else {
				// Take from right
				input[i] = right[rightSideIndex];
				rightSideIndex++;
			}

			

		}

	}

	/*
	 * QuickSort
	 * 
	 * Best Case: o(nlogn) Average Case: o(nlogn) Worst Case: o(n^2)
	 * 
	 * Algorithm
	 * 
	 * QuickSort(A, StartIndex, EndIndex) 1: if StartIndex < EndIndex 2:
	 * partitionIndex = partition(startIndex,endIndex); 3:
	 * quickSort(startIndex,partitionIndex); 4:
	 * quickSort(partitionIndex+1,A.length);
	 * 
	 * partition(startIndex, endIndex) 1: pivotIndex = endIndex- 1; 2: j =
	 * startIndex-1; 3: for i=0 ;i * 3.1 if( i == endIndex -1) 3.1.1 j = j+1;
	 * 3.1.2 swap(i,j);
	 * 
	 * 3.2 else if(arrayToSort[i]<= arrayToSort[pivotIndex]) 3.2.1 j = j+1;
	 * 3.2.2 swap(i,j); 4: return j;
	 */

	public static void quickSort(int[] input) {
		 quickSort(0,input.length,input);
	}
	
	public static void quickSort(int startIndex, int endIndex, int [] input) {
		 if(startIndex < endIndex){
			 int partitionIndex = partitionIt(startIndex,endIndex,input);
			 quickSort(startIndex,partitionIndex,input);
			 quickSort(partitionIndex+1,input.length,input);
        }
	}

	public static int partitionIt(int startIndex, int endIndex, int[] arrayToSort) {
		int pivotIndex = endIndex - 1;
		int j = startIndex - 1;
		for (int i = startIndex; i < endIndex; i++) {
			if (i == endIndex - 1) {
				j = j + 1;
				swapIt(arrayToSort, i, j);
			} else if (arrayToSort[i] <= arrayToSort[pivotIndex]) {
				j = j + 1;
				swapIt(arrayToSort, i, j);
			}
		}
		return j;
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
		quickSort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i] + ",");
		}
	}

}

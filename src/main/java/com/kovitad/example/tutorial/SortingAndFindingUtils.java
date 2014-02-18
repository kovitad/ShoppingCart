package com.kovitad.example.tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SortingAndFindingUtils<T> {

	public static <T extends Comparable<T>> void sort(SortingType type,
			List<T> source) {
		switch (type) {
		case BUBBLE:
			bubbleSort(source);
			break;
		case MERGE:
			mergeSort(source);
			break;
		case SELECTION:
			selectionSort(source);
			break;
		case QUICK:
			quickSort(source);
			break;
		default:
			mergeSort(source);

			break;
		}

	}

	/**
	 * O(n^2)
	 * 
	 * @param source
	 */
	public static <T extends Comparable<T>> void bubbleSort(List<T> source) {

		for (int i = 0; i < source.size(); i++) {
			for (int j = 1; j < source.size(); j++) {
				if (source.get(j - 1).compareTo(source.get(j)) >= 0) {
					swap(source, j - 1, j);
				}
			}
		}
	}

	/**
	 * 
	 * O(n^2)
	 * 
	 * @param source
	 */
	public static <T extends Comparable<T>> void selectionSort(List<T> source) {

		for (int i = 0; i < source.size() - 1; i++) {
			int selectionIndex = i;
			for (int j = i; j < source.size(); j++) {
				if (source.get(selectionIndex).compareTo(source.get(j)) >= 0) {
					selectionIndex = j;
				}
			}

			swap(source, selectionIndex, i);
		}

	}

	
	
	
	
	/**
	 * O(n log n)
	 * 
	 * @param source
	 */
	public static <T extends Comparable<T>> void mergeSort(List<T> source) {
		T[] resultArray = (T[]) Array.newInstance(source.get(0).getClass(),
				source.size());
		source.toArray(resultArray);
		sort(resultArray);
		source.clear();
		source.addAll(Arrays.asList(resultArray));

	}

	public static <T extends Comparable<T>> void sort(T[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	/*
	 * The mergeSort algorithm implementation
	 */
	private static <T extends Comparable<T>> void mergeSort(T[] array,
			int left, int right) {

		if (left < right) {

			// split the array into 2
			int center = (left + right) / 2;

			// sort the left and right array
			mergeSort(array, left, center);
			mergeSort(array, center + 1, right);

			// merge the result
			merge(array, left, center + 1, right);
		}
	}

	/*
	 * The merge method used by the mergeSort algorithm implementation.
	 */
	private static <T extends Comparable<T>> void merge(T[] array,
			int leftArrayBegin, int rightArrayBegin, int rightArrayEnd) {

		int leftArrayEnd = rightArrayBegin - 1;
		int numElements = rightArrayEnd - leftArrayBegin + 1;
		@SuppressWarnings("unchecked")
		T[] resultArray = (T[]) Array.newInstance(array[0].getClass(),numElements);
		int resultArrayBegin = 0;

		// Find the smallest element in both these array and add it to the
		// result
		// array i.e you may have a array of the form [1,5] [2,4]
		// We need to sort the above as [1,2,4,5]
		while (leftArrayBegin <= leftArrayEnd
				&& rightArrayBegin <= rightArrayEnd) {
			if (array[leftArrayBegin].compareTo(array[rightArrayBegin]) <= 0) {
				resultArray[resultArrayBegin++] = array[leftArrayBegin++];
			} else {
				resultArray[resultArrayBegin++] = array[rightArrayBegin++];
			}
		}

		// After the main loop completed we may have few more elements in
		// left array copy them first
		while (leftArrayBegin <= leftArrayEnd) {
			resultArray[resultArrayBegin++] = array[leftArrayBegin++];
		}

		// After the main loop completed we may have few more elements in
		// right array copy them
		while (rightArrayBegin <= rightArrayEnd) {
			resultArray[resultArrayBegin++] = array[rightArrayBegin++];
		}

		// Copy resultArray back to the main array
		for (int i = numElements - 1; i >= 0; i--, rightArrayEnd--) {
			array[rightArrayEnd] = resultArray[i];
		}
	}

	/**
	 * O(n log n)
	 * 
	 * @param source
	 */
	public static <T extends Comparable<T>> void quickSort(List<T> source) {

	}

	private static <T extends Comparable<T>> void swap(List<T> source,
			final int x, final int y) {
		final List<T> l = source;
		l.set(x, l.set(y, l.get(x)));
	}

}

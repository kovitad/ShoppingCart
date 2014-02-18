package com.kovitad.example.tutorial;

import java.util.Arrays;

public class MergeSource <T extends Comparable<T>> {
	
	private T[] source;
	
	private int selectedLeft = 0;
	private int selectedRight = 0;
	
	public MergeSource(T[] source) {
		this.source = source;
	}
	
	public T[] execute(T[] source){
		if(source.length > 1) {
			//Divide and conquer
			int size = source.length;
			int mid = size/2;
			T[] left = Arrays.copyOfRange(source, 0, mid);
			T[] right = Arrays.copyOfRange(source, mid, size);
			merge( execute(left), execute(right),mid ,size);	
		}
		return source;
	}
	
	public void merge(T[] left, T[] right,int mid, int size) {
		for(int i =0;i<left.length;i++){
			//copy from left
			if(left[selectedLeft].compareTo(right[i]) >=0) {
				source[i] = left[selectedLeft];
				selectedLeft++;
			} else {
				source[i] = left[selectedRight];
				selectedRight++;
			}
		}
	}
	public static void main(String[] argv) {
		int[] test = new int[]{1,2,3,4};
		int size = test.length;
		int mid = size/2;
		int[] left = Arrays.copyOfRange(test, 0, mid);
		int[] right = Arrays.copyOfRange(test, mid, size);
		for(int i=0;i<left.length;i++){
			System.out.print(left[i]+",");
			
		}
		System.out.println();
		
		for(int i=0;i<right.length;i++){
			System.out.print(right[i]+",");
			
		}
	}
	
	
}

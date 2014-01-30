package com.kovitad.dao;

import java.util.ArrayList;
import java.util.List;

import com.kovitad.example.tutorial.SortingAndFindingUtils;
import com.kovitad.example.tutorial.SortingType;


public class TestUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> test = new ArrayList<>();
		test.add(5);
		test.add(2);
		test.add(0);
		test.add(100);
		test.add(7);
		test.add(1);
		
		SortingAndFindingUtils.sort(SortingType.MERGE, test);
		System.out.println(test);
		
		
	}

}

package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllElementsGreaterthanGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		boolean result=numbers.stream().allMatch(n->n>5);
		
		System.out.println(result);
		
		
	 int result2= numbers.stream()
		 		.sorted(Comparator.reverseOrder())
		 		.skip(1)
		 		.findFirst()
		 		.orElseThrow(() -> new RuntimeException());
		
		System.out.println(result2);
	}
	

}

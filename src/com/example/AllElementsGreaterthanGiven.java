package com.example;

import java.util.Arrays;
import java.util.List;

public class AllElementsGreaterthanGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
		boolean result=numbers.stream().allMatch(n->n>5);
		
		System.out.println(result);
		
		
	}
	

}

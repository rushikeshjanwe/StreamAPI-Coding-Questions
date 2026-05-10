package com.example;

import java.util.Arrays;
import java.util.List;

public class AvgListOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
		double result=numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		
		System.out.println(result);
		
		double result2=numbers.stream().filter(n->n%2==0).mapToInt(i->i).average().orElse(0.0);
		
		System.out.println(result2);
		
	}

}

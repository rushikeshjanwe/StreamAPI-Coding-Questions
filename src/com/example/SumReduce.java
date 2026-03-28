package com.example;

import java.util.Arrays;
import java.util.List;

public class SumReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		
		int result=numbers.stream().reduce(0,Integer::sum);
		
		System.out.println(result);
	}

}

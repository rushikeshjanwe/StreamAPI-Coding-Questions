package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		int num=numbers.stream().sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst()
								.orElseThrow(() -> new RuntimeException("No Second highest found"));
	   	
			System.out.println(num);
}
	
}

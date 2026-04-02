package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("Java", "is", "awesome"); 

		String result=words.stream().collect(Collectors.joining());
		
		System.out.println(result);

		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50); 
		
		Integer num=numbers.stream() 
				.sorted(Comparator.reverseOrder()) 
				.skip(1) // Skip the highest 
				.findFirst() 
				.orElseThrow(() -> new RuntimeException("No second highest found"));
		
		System.out.println(num);
	}

}

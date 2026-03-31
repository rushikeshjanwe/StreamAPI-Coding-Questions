package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringsAlphabeticallyReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Charlie", "Alice", "Bob"); 
		
		List<String> result= names.stream()
									.sorted()	
									.collect(Collectors.toList());
		System.out.println(result);
		
		List<String> result2=names.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		
		System.out.println(result2);
						
		
		
	}

}

package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="java";
		
		List<String> names = Arrays.asList("Charlie", "Alice", "Bob"); 
		
		List<String> result=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
	    List<String> result2=names.stream().sorted().collect(Collectors.toList());
	    
	    System.out.println(result2);
		
		System.out.println(result);
		
		
		
		
		
	}

}

package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementStartA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("Abhi","Bob","Ash");
		
		List<String> result=names.stream()
							.filter(name-> name.startsWith("A"))	
							.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		
		
		 
		 
	}

}

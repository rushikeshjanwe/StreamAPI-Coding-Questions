package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLengthofString {


	
	public static void main(String[] args) {

		List<String> list=Arrays.asList("Roy","Tom","Jerry");
		
		List<Integer> result=list.stream()
			                     .map(String::length)								
			                     .collect(Collectors.toList());
		System.out.println(result);

		Map<Integer, List<String>> result2 = list.stream()
			    .collect(Collectors.groupingBy(String::length));
		
		System.out.println(result2);
	}

}

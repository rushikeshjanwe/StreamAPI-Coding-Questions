package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//NORMAL WAY 
		
		List<String> li=Arrays.asList("Nomad","Reoy","Roy");
				
		Map<Integer,List<String>> result=li.stream()
											.collect(Collectors.groupingBy(String::length));
				
		System.out.println(result);
				
		// WITH REDUCE		
				
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		
		int result2=numbers.stream().reduce(0,Integer::sum);
		
		System.out.println(result);
	}

}

package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("Roy","Tom","Jerry");
		
		List<String>  result=list.stream()
				      .map(String::toUpperCase)
				      .collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> res1=list.stream()
						      .map(String::length)								
						      .collect(Collectors.toList());
		
		System.out.println(res1);
	}

}

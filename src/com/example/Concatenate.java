package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("Java", "is", "awesome"); 

		String result=words.stream().collect(Collectors.joining());
		
		System.out.println(result);

	}

}

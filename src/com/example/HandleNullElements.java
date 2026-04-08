package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HandleNullElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Java", null, "Spring", null);
		
		List<String> result=list.stream().filter(Objects::nonNull)
			         .collect(Collectors.toList());
		
		System.out.println(result);

	}

}

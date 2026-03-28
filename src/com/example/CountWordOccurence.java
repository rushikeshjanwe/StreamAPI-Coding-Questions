package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li=Arrays.asList("Nomad","Roy","Roy");
		
		Map<String,Long> wordCount=li.stream()
									.collect(Collectors.groupingBy(w->w,Collectors.counting()));
		
		System.out.println(wordCount);
									     

	}

}

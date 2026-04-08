package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFreqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "programming"; 
		
		
		Map<Character,Long> frequency=input.chars()
										   .mapToObj(c -> (char)c)
										   .collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(frequency);
		
		
				
	}

}

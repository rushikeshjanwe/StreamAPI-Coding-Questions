package com.example;

public class FirstNonRepeatedCharacterInString {

	
	
	public static void main(String[] args) {
		
		String input="Swiss";
		
		Character result= input.chars()
						.mapToObj(c-> (char)c)
						.filter(ch -> input.indexOf(ch)==input.lastIndexOf(ch))
						.findFirst()
						.orElse(null);
		
		System.out.println(result);
	}
}

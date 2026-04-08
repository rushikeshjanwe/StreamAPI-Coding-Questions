package com.example;

import java.util.HashSet;
import java.util.Set;

public class OccurenceOfEachWord {

	
	static char findFirstRepeating(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
			
					return str.charAt(i);
				}
			}
			
		}
		
		return '\0';
		
	}
	
	public static void main(String[] args) {
		
	char result=findFirstRepeating("programming");
		
		System.out.println("Normal : " +result);
		
		String str="programming";
		Set<Character> set=new HashSet<>();
		
		char result2=str.chars()
						.mapToObj(c->(char)c)
						.filter(ch -> !set.add(ch))
						.findFirst()
						.orElse('\0');
		
		System.out.println("With Stream : " +result2);
		
	}

}

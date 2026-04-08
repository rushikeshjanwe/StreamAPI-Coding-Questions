
package com.example;

import java.util.stream.IntStream;

public class CheckUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="prog";
		
		boolean isUnique=str.chars()
							.mapToObj(c -> (char)c)
							.distinct()
							.count() == str.length();
		
		System.out.println(isUnique);

	}

}

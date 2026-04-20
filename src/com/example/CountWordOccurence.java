package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
									     

		// WITH REDUCE
		
		List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
		
		int result3=l2.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(result3);
		
		
		
		int result2=l2.stream().reduce(0,Integer::sum);
		System.out.println(result2);
		
	}

}

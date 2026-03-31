package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list= Arrays.asList(40,1,2,3,7,3,9);
		
	     
	   Integer result=list.stream().max(Integer::compare).orElse(0);
	    
	   System.out.println(result);
	   
	   
	}
}

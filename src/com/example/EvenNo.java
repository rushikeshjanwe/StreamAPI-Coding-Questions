package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		
	    List<Integer> result=list.stream()
	    		                 .filter(x->x%2==0)
	    		                 .collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}

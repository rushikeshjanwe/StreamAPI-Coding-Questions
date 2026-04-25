package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {

		static void remDuplicates() {
	   
			List<Integer> asList=Arrays.asList(1,2,3,4,1,2,3);
			
			List<Integer> result=asList.stream().distinct().collect(Collectors.toList());
			
			System.out.println(result);
			
	    }


	
	    public static void main(String[] args) {
	      
	    remDuplicates();	
	    	
	    }

}

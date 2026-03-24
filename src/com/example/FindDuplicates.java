package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FindDuplicates {

	
	static void  printList() {
		
		 List<Integer> list = Arrays.asList(1,2,3,1,2,1);
	     
	     Set<Integer> hash = new HashSet<>();
	     
	     Set<Integer> result=list.stream()
	     		.filter(x -> !hash.add(x))
	     		.collect(Collectors.toSet());
	     
	     System.out.println(result);
			
		}
	
	static void withStreams() {
		
		List<Integer> list = Arrays.asList(1,2,3,1,2,1);
	       
	    Set<Integer> hash = new HashSet<>();
	    
	    Set<Integer> result=new HashSet<>();
	    
	    for(Integer x : list) {
	    	if(hash.contains(x)) {
	    		result.add(x);
	    	}      
	      }
	    
	    System.out.println(result);
		
	}
	
	public static void main(String[] args) {
	
	}
	
}

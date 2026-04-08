package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

	       
		 Set<Integer> set=new HashSet<>();
		 
		 Set<Integer> duplicates=new HashSet<>();
		 
		 
		 for (int num : list) {
			if(!set.add(num)) {
				duplicates.add(num);
			}
		}
		 
//	 Set<Integer> duplicates3=list.stream()
//			                      .filter(num -> !set.add(num))
//			                      .collect(Collectors.toSet());
//		 
//		System.out.println(duplicates3);
		System.out.println(duplicates);
		
	}

}

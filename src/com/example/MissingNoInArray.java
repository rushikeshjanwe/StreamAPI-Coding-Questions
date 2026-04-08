package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr=Arrays.asList(1,2,4,5);
		
		 int n = arr.size() + 1; // because one number is missing

	        int totalSum = n * (n + 1) / 2; // sum of 1 to n
	        int arrSum = 0;

	        for (int num : arr) {
	            arrSum += num;
	        }

	        int missing = totalSum - arrSum;

	        System.out.println(missing);
	        
	        int missing1=IntStream.rangeClosed(1, n)
	        					 .filter(i -> !arr.contains(i))
	        					 .findFirst()
	        					 .orElse(-1);
	        System.out.println(missing1);
	        
	}

}

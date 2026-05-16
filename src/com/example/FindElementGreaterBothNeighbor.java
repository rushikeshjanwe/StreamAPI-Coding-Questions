package com.example;

import java.util.stream.IntStream;

public class FindElementGreaterBothNeighbor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 15, 25, 30, 20, 50};
		
		IntStream.range(1, arr.length-1)
				 .filter(i -> arr[i] > arr[i-1] && arr[i] > arr[i+1])
				 .map(i -> arr[i])
				 .forEach(System.out::println);
		
		
		
		//findSpikes(arr);
		
		
	}
	
	public static void findSpikes(int[] arr) {
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				System.out.println(arr[i] + " ");
			}
		}
	}

	    
}

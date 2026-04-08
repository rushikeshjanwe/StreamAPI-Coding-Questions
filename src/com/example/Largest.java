package com.example;

import java.util.Arrays;
import java.util.List;

public class Largest {
	
	
	static int largest(int[] arr) {
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				  max=arr[i];
				
			}
		}
		System.out.println(max);
		return max;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   largest(new int[] {1,8,7,56,90});
	   
	   
	     
	      
	} 

}

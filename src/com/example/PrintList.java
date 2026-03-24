package com.example;

import java.util.Arrays;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> asList=Arrays.asList("Rahul","Roy","Ajay");
		
		asList.forEach(a -> System.out.println(a));
	}

}

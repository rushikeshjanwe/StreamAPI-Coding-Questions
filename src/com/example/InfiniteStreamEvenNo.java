package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> num=Stream.iterate(0, n->n+2)
						  .limit(10)
						  .collect(Collectors.toList());
		
		System.out.println(num);
	}

}

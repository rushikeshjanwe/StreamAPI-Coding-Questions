package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SumOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num= Arrays.asList(10,20,30,40,50);
		
		int sum=num.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		List<Integer> result=	num.stream().filter(n->n%2==0).map(n->n*2).collect(Collectors.toList());
	
	System.out.println(result);
	
	String str = "java is good java is easy";
	
	Map<String,Long> result2=Arrays.stream(str.split(" "))
			.collect(Collectors.groupingBy(word->word,Collectors.counting()));
	
	System.out.println(result2);
	
	
	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
    List<Integer> list3 = Arrays.asList(5, 4, 8, 9);
    
    
    List<Integer> result3=list1.stream()
    						   .filter(list2::contains)
    						   .filter(list3::contains)
    						   .collect(Collectors.toList());
    
    System.out.println(result3);
	}
	

}

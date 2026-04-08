package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeHighEmployee {
	
	
	  int id;
	    String name;
	    double salary;
	    
	    
	    TopThreeHighEmployee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String toString() {
	        return name + ": " + salary;
	    }
	
	    public static void main(String[] args) {

	        List<TopThreeHighEmployee> list = Arrays.asList(
	                new TopThreeHighEmployee(1, "A", 10000),
	                new TopThreeHighEmployee(2, "B", 30000),
	                new TopThreeHighEmployee(3, "C", 20000),
	                new TopThreeHighEmployee(4, "D", 40000)
	        );

	       List<TopThreeHighEmployee> result= list.stream()
	            .sorted(Comparator.comparing(TopThreeHighEmployee::getSalary).reversed())
	            .limit(3)
	            .collect(Collectors.toList());
	       
	      System.out.println(result);
	    }
	    
	    
}


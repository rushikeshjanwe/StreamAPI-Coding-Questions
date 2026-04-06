package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeSorted {
    
    String name; 
    int salary; 
    
    EmployeeSorted(String name, int salary) { 
        this.name = name; 
        this.salary = salary; 
    } 
        
    public String toString() { 
        return name + ": " + salary; 
    } 
    
    public static void main(String[] args) {
        
        List<EmployeeSorted> employees = Arrays.asList( 
            new EmployeeSorted("Alice", 5000), 
            new EmployeeSorted("Bob", 3000), 
            new EmployeeSorted("Charlie", 4000) 
        ); 
        
        List<EmployeeSorted> sorted = employees.stream()
                .sorted(Comparator.comparingInt(e -> e.salary))
                .collect(Collectors.toList());
        
        System.out.println(sorted);
    }
}
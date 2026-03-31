package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Employee {
    
    String name; 
    int salary; 
    
    Employee(String name, int salary) { 
        this.name = name; 
        this.salary = salary; 
    } 
        
    public String toString() { 
        return name + ": " + salary; 
    } 
    
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList( 
            new Employee("Alice", 5000), 
            new Employee("Bob", 3000), 
            new Employee("Charlie", 4000) 
        ); 
        
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingInt(e -> e.salary))
                .collect(Collectors.toList());
        
        System.out.println(sorted);
    }
}
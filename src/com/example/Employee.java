package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    
  
    
    @Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
    	
    	List<Employee> employees = List.of(
    		    new Employee("Ravi", "HR", 50000),
    		    new Employee("Amit", "IT", 70000),
    		    new Employee("Neha", "HR", 65000),
    		    new Employee("Priya", "Finance", 60000),
    		    new Employee("Karan", "HR", 72000),
    		    new Employee("Suresh", "IT", 80000)
    		);
    	
    	
    	Employee result=employees.stream().filter(emp -> emp.getDepartment().equals("HR"))
    					  .max(Comparator.comparing(Employee::getSalary))
    					  .orElse(null);
    	
    	
    	//Ascending
    	Employee ascending=employees.stream()
    							  .sorted(Comparator.comparing(Employee::getSalary))
    							  .findFirst()
    							  .orElse(null);
    								    			
    	//System.out.println(ascending);
    	
    	//Descending
    	
    	List<Employee> descending=employees.stream()
    								 .sorted(Comparator.comparing(Employee::getSalary).reversed())
    								 .toList();
    	
    	System.out.println(descending);
    	
    	//Sort by name (alphabetical)
    	List<Employee> name=employees.stream()
    								 .sorted(Comparator.comparing(Employee::getName))
    								 .toList();
    	
    //	System.out.println(name);
  
    	//Sort by department, salary
    	List<Employee> result44=employees.stream()
    					  .sorted(Comparator.comparing(Employee::getDepartment)
    					  .thenComparing(Employee::getSalary))
    					  .toList();
    	System.out.println(result44);
	
	
	// Sort by salary DESC, then name ASC (tie-breaker)
	    
   List<Employee> resultAll= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()
    		          .thenComparing(Employee::getName))
    				  .toList();
   
   System.out.println(resultAll);
}
}

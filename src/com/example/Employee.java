package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	
	Integer id;
    String name;
    String department;
    double salary;
    String city;

	
    public Employee(Integer id, String name, String department, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.city = city;
	}
    
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
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
		
		
		List<Employee> emp2 = List.of(
			    new Employee(1, "Rushi", "IT", 50000, "Pune"),
			    new Employee(2, "Amit", "HR", 40000, "Mumbai"),
			    new Employee(3, "Neha", "IT", 60000, "Pune"),
			    new Employee(4, "Priya", "Finance", 70000, "Delhi"),
			    new Employee(5, "Karan", "HR", 45000, "Pune")
			);
    	
    	List<Employee> employees = List.of(
    		    new Employee("Ravi", "HR", 50000),
    		    new Employee("Amit", "IT", 70000),
    		    new Employee("Neha", "HR", 65000),
    		    new Employee("Priya", "Finance", 60000),
    		    new Employee("Karan", "HR", 72000),
    		    new Employee("Suresh", "IT", 80000)
    		);
    	
    	
    	List<String> names=emp2.stream().filter(emp -> emp.getCity().equals("Pune"))
    	             .sorted(Comparator.comparing(Employee::getName))
    	             .map(Employee::getName)
    	             .collect(Collectors.toList());
    	
    	System.out.println(names);
    	
    	Map<String, Long> result33 = emp2.stream()
    		    .collect(Collectors.groupingBy(
    		        emp -> emp.getName(),
    		        Collectors.counting()
    		    ));

    		System.out.println(result33);
    	// Department count using GroupingBy
    	Map<String, Long> deptCount=employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.counting()));
    	
    	System.out.println(deptCount);
    	
    	////////////////////////////////////////////////////////////////////////////
    	///
    	///
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

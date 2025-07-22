package com.cts.oopdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.cts.oopdemo.models.Employee;

public class App14StreamsApiDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1, "Vamsy",50000));
		emps.add(new Employee(10, "Amrutha",70000));
		emps.add(new Employee(9, "Jahnavi",40000));
		emps.add(new Employee(6, "Dileep",30000));
		emps.add(new Employee(8, "Chandra",90000));
		emps.add(new Employee(4, "Poorna",55000));
		emps.add(new Employee(2, "Bharat",65000));
		emps.add(new Employee(5, "Elvin",45000));
		emps.add(new Employee(7, "Farookh",35000));
		emps.add(new Employee(3, "Kiran",25000));
		
		emps.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		Collections.sort(emps);
		emps.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
				
		Collections.sort(emps, (o1,o2) -> o1.getFullName().compareTo(o2.getFullName()) );
		emps.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		//Employee emp = emps.stream().reduce(new Employee(), (e1,e2) -> e1.getSalary()>e2.getSalary()?e1:e2);
		Optional<Employee> result = emps.stream().reduce((e1,e2) -> e1.getSalary()>e2.getSalary()?e1:e2);
		System.out.println("Employee with max sal: "+result.get());		
		
		System.out.println("--------------------------------------------");
		emps.stream()
			//.map(e -> e.getFullName())
			.map(Employee::getFullName)	
			.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		emps.stream()
			//.map(e -> e.getFullName())
			.map(Employee::getFullName)		
			.filter(nm -> nm.endsWith("a"))
			.forEach(System.out::println);
	
		System.out.println("--------------------------------------------");
		emps.stream()
			.filter(e -> e.getSalary()>=60000)
			//.map(e -> e.getFullName())
			.map(Employee::getFullName)
			.filter(nm -> nm.endsWith("a"))
			.forEach(System.out::println);
		
		
	}

}

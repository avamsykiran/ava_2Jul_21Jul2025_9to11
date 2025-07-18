package com.cts.oopdemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.cts.oopdemo.models.Employee;

public class App12SetsDemo {

	public static void main(String[] args) {
		
		//Set<Employee> emps = new HashSet<>();
		//Set<Employee> emps = new LinkedHashSet<>();
		//Set<Employee> emps = new TreeSet<>();
				
		Comparator<Employee> compareEmpOnName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {				
				return o1.getFullName().compareTo(o2.getFullName());
			}
			
		};
		
		Set<Employee> emps = new TreeSet<>(compareEmpOnName);
		
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
		
		for(Employee e:emps) {
			System.out.println(e);
		}
		
	}

}

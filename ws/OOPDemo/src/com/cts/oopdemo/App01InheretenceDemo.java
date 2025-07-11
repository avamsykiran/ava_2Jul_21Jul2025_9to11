package com.cts.oopdemo;

import com.cts.oopdemo.models.ContractEmployee;
import com.cts.oopdemo.models.Director;
import com.cts.oopdemo.models.Employee;
import com.cts.oopdemo.models.Manager;

public class App01InheretenceDemo {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Vamsy",56000);
		ContractEmployee ce = new ContractEmployee(102,"Sameer", 45000, 10);
		Manager m = new Manager(103, "Murthy", 67000, 12000);
		Director d = new Director(104, "Prem", 89000, 15000, 10);
		
		System.out.println(e);
		System.out.println(ce);
		System.out.println(m);
		System.out.println(d);
	}

}

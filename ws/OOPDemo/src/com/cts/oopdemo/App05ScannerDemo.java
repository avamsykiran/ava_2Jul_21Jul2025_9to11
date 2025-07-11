package com.cts.oopdemo;

import java.util.Scanner;

import com.cts.oopdemo.models.Employee;

public class App05ScannerDemo {

	public static void main(String[] args) {

		Scanner kbin = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("EmpId: ");
		emp.setEmpId(kbin.nextInt());
		System.out.print("Name: ");
		emp.setFullName(kbin.next());
		System.out.print("Salary: ");
		emp.setSalary(kbin.nextDouble());
		
		System.out.println(emp);
		
		kbin.close();
	}

}

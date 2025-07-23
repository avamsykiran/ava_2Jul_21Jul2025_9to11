package com.cts.empcrud;

import java.util.List;
import java.util.Scanner;

import com.cts.empcrud.exceptions.DataOperationFailedException;
import com.cts.empcrud.model.Employee;
import com.cts.empcrud.service.EmployeeService;
import com.cts.empcrud.service.EmployeeServiceImpl;

public class EmpCrudApp {

	private static Scanner kbin;
	private static EmployeeService empService;
	
	public static void main(String[] args) {
		
		kbin = new Scanner(System.in);
		
		try {
			empService = new EmployeeServiceImpl();
			System.out.println("Database Ready!");
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		String cmd = null;
		
		while(!"quit".equalsIgnoreCase(cmd)) {
			System.out.println("Command (add/del/list/quit)> ");
			cmd = kbin.next().toLowerCase();
			
			switch(cmd) {
			case "add": doAdd(); break;
			case "del": doDel(); break;
			case "list": doList(); break;
			case "quit": 
				System.out.println("Bye! Thanq! ");
				break;
			default:
				System.out.println("UnKnown Command");
			}
		}
		
		kbin.close();

	}

	private static void doList() {
		try {
			List<Employee> emps = empService.findAll();
			
			if(emps==null || emps.isEmpty()) {
				System.out.println("No Records!");
			}else {
				emps.stream().forEach(System.out::println);
			}
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void doDel() {
		System.out.println("EmpId: ");
		int empId = kbin.nextInt();
		try {
			empService.deleteById(empId);
			System.out.println("Employee Record Deleted!");
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}	
	}

	private static void doAdd() {
		System.out.println("EmpId: ");
		int empId = kbin.nextInt();
		System.out.println("Full Name: ");
		String fullName = kbin.next();
		System.out.println("Salary: ");
		double sal = kbin.nextDouble();
		
		try {
			empService.add(new Employee(empId, fullName, sal));
			System.out.println("Employee Record Saved!");
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
	}

}

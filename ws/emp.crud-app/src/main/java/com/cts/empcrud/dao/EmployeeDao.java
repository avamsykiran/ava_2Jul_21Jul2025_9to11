package com.cts.empcrud.dao;

import java.util.List;
import java.util.Optional;

import com.cts.empcrud.exceptions.DataOperationFailedException;
import com.cts.empcrud.model.Employee;

public interface EmployeeDao {
	List<Employee> findAll() throws DataOperationFailedException;
	Optional<Employee> findById(int empId) throws DataOperationFailedException;
	Employee add(Employee employee) throws DataOperationFailedException;
	Employee update(Employee employee) throws DataOperationFailedException;
	void deleteById(int empId) throws DataOperationFailedException;
}

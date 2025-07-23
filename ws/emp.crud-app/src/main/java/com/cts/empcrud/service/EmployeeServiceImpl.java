package com.cts.empcrud.service;

import java.util.List;
import java.util.Optional;

import com.cts.empcrud.dao.EmployeeDao;
import com.cts.empcrud.dao.EmployeeDaoImpl;
import com.cts.empcrud.exceptions.DataOperationFailedException;
import com.cts.empcrud.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao empDao;
	
	public EmployeeServiceImpl() throws DataOperationFailedException {
		this.empDao = new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> findAll() throws DataOperationFailedException {
		return empDao.findAll();
	}

	@Override
	public Optional<Employee> findById(int empId) throws DataOperationFailedException {
		return empDao.findById(empId);
	}

	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		// Validation logic and call the dao method only when the data received is valid.
		return empDao.add(employee);
	}

	@Override
	public Employee update(Employee employee) throws DataOperationFailedException {
		// Validation logic and call the dao method only when the data received is valid.
		return empDao.update(employee);
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		empDao.deleteById(empId);
	}

}

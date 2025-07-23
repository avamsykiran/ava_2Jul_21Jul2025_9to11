package com.cts.empcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cts.empcrud.exceptions.DataOperationFailedException;
import com.cts.empcrud.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	public final static String DB_URL = "jdbc:h2:~/empsdb" ;
	public final static String DB_UID = "sa" ;
	public final static String DB_PWD = "" ;
	
	public final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS emps (eid INT PRIMARY KEY,fnm VARCHAR(50) NOT NULL,sal NUMERIC NOT NULL)" ;
	public final static String GET_ALL = "SELECT eid,fnm,sal FROM emps" ;
	public final static String GET_BY_ID = "SELECT eid,fnm,sal FROM emps WHERE eid=?";
	public final static String INS_QRY = "INSERT INTO emps(eid,fnm,sal) VALUES(?,?,?)";
	public final static String UPD_QRY = "UPDATE emps SET fnm=?,sal=? WHERE eid=?";
	public final static String DEL_QRY = "DELETE FROM emps WHERE eid=?";

	public EmployeeDaoImpl() throws DataOperationFailedException {
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(CREATE_TABLE);){
			pst.execute();
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to create table \nTech_Err_Msg>> " + exp.getMessage());
		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL,DB_UID,DB_PWD);
	}
	
	@Override
	public List<Employee> findAll() throws DataOperationFailedException {
		List<Employee> emps = null;
		
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(GET_ALL);){
			ResultSet rs  = pst.executeQuery();
			emps = new ArrayList<>();
			while(rs.next()) {
				int empId = rs.getInt(1);
				String fullName = rs.getString(2);
				double sal = rs.getDouble(3);
				emps.add(new Employee(empId, fullName, sal));
			}
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to retrive \nTech_Err_Msg>> " + exp.getMessage());
		}
		
		return emps;
	}

	@Override
	public Optional<Employee> findById(int empId) throws DataOperationFailedException {
		Employee emp = null;
		
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(GET_BY_ID);){
			pst.setInt(1, empId);						
			ResultSet rs  = pst.executeQuery();			
			if(rs.next()) {				
				String fullName = rs.getString(2);
				double sal = rs.getDouble(3);
				emp = new Employee(empId, fullName, sal);
			}
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to retrive \nTech_Err_Msg>> " + exp.getMessage());
		}
		
		return emp!=null? Optional.of(emp) : Optional.empty();
	}

	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(INS_QRY);){
			pst.setInt(1, employee.getEmpId());						
			pst.setString(2,employee.getFullName());						
			pst.setDouble(3, employee.getSalary());
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to save \nTech_Err_Msg>> " + exp.getMessage());
		}
		
		return employee;
	}

	@Override
	public Employee update(Employee employee) throws DataOperationFailedException {
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(UPD_QRY);){			
			pst.setString(1,employee.getFullName());						
			pst.setDouble(2, employee.getSalary());
			pst.setInt(3, employee.getEmpId());						
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to update \nTech_Err_Msg>> " + exp.getMessage());
		}
		
		return employee;
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		try( Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(DEL_QRY);){			
			pst.setInt(1,empId);						
			pst.executeUpdate();
		}catch(SQLException exp) {
			throw new DataOperationFailedException("Unable to delete \nTech_Err_Msg>> " + exp.getMessage());
		}
	}

}

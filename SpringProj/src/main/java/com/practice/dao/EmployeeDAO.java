package com.practice.dao;

import java.util.List;

import com.practice.model.EmployeeVO;
 
public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();

	public void addEmployee(EmployeeVO employee);
}

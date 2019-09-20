package com.practice.service;

import java.util.List;

import com.practice.model.EmployeeVO;
 
public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();

	public void insertEmployeeRec(EmployeeVO employeeVO);
}
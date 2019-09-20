package com.practice.dao;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Repository;
 
import com.practice.model.EmployeeVO;
 
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    public List<EmployeeVO> getAllEmployees()
    {
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
         
        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setName("Lokesh");
        vo1.setContactNumber("9876543210");
         
        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setName("Raj");
        vo2.setContactNumber("9876543211");
        
        employees.add(vo1);
        employees.add(vo2);
        return employees;
    }

	public void addEmployee(EmployeeVO employee) {
		System.out.println("Emp inserted in DB :" + employee.getName());		
	}
}

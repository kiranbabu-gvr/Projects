package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.EmployeeVO;
import com.practice.service.EmployeeManager;
 
@Controller
@RequestMapping("/employee-module")
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;
    
    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeForm", "employee", new EmployeeVO());
    }
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
    
    @RequestMapping(value = "/getEmployeeName", method = RequestMethod.GET)
    public String getEmployeeName(@PathVariable("name") String name, Model model)
    {
        model.addAttribute("empname", name);
        return "employeeName";
    }
    
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee")EmployeeVO employeeVO, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        
        manager.insertEmployeeRec(employeeVO);
        
        model.addAttribute("id", employeeVO.getId());
        model.addAttribute("name", employeeVO.getName());
        model.addAttribute("contactNumber", employeeVO.getContactNumber());
        return "employeeView";
    }
    
}

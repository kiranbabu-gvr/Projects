package com.practice.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.CalculatorVO;

@Controller
@RequestMapping("/calculator-module")
public class CalculatorController
{
    @RequestMapping("/showForm")
    public ModelAndView showCalculatorForm()
    {
    	return new ModelAndView("calculatorForm", "calculator", new CalculatorVO());
    }
    
    @RequestMapping(value="/processCalcForm",params="add",method=RequestMethod.POST)
    public ModelAndView action1(@ModelAttribute("calculator")CalculatorVO calculatorVO, 
    	      BindingResult result, ModelMap model)
    {
    	calculatorVO.setResult(calculatorVO.getFirstNumber()+calculatorVO.getSecondNumber());
    	return new ModelAndView("calculatorForm", "calculator", calculatorVO);
    }
   
    @RequestMapping(value="/processCalcForm",params="substract",method=RequestMethod.POST)
    public ModelAndView action2(@ModelAttribute("calculator")CalculatorVO calculatorVO, 
  	      BindingResult result, ModelMap model)
    {
    	calculatorVO.setResult(calculatorVO.getFirstNumber() - calculatorVO.getSecondNumber());
    	return new ModelAndView("calculatorForm", "calculator", calculatorVO);
    }
    
    @RequestMapping(value="/processCalcForm",params="multiply",method=RequestMethod.POST)
    public ModelAndView action3(@ModelAttribute("calculator")CalculatorVO calculatorVO, 
  	      BindingResult result, ModelMap model)
    {
    	calculatorVO.setResult(calculatorVO.getFirstNumber() * calculatorVO.getSecondNumber());
    	return new ModelAndView("calculatorForm", "calculator", calculatorVO);
    }
    
    @RequestMapping(value="/processCalcForm",params="divide",method=RequestMethod.POST)
    public ModelAndView action4(@ModelAttribute("calculator")CalculatorVO calculatorVO, 
  	      BindingResult result, ModelMap model)
    {
    	calculatorVO.setResult(calculatorVO.getFirstNumber() / calculatorVO.getSecondNumber());
    	return new ModelAndView("calculatorForm", "calculator", calculatorVO);
    }
}
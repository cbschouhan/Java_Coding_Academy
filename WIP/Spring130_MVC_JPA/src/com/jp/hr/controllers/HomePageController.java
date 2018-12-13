package com.jp.hr.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceProduct;


// to run the page go to following url : http://localhost:8080/Spring110_MVCBasics/homePage.do

/*
 * @Controller: A kind of @Component to declare SpringMVC Controllers.
 * @RequestMapping: To map a controlling method to the URL.
 * @RequestParam: To take a single QueryString or FormData field Value. 
 * 
 * Multi-action Controllers
 */


@Controller
public class HomePageController {
	@Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	
	
	@Autowired
	@Qualifier("serviceprd")
	private ServiceProduct prdService;
	
	//@Autowired
	private Validator validator;
	
	@InitBinder
	private void validateBinder(){
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		validator = validationFactory.getValidator();
	}
	
	@RequestMapping("homePage.hr")
	public String getHomePage(){
		System.out.println("In getHomePage()");
		return "HomePage";
	}
	
	@RequestMapping("getEmpList.hr")
	public ModelAndView getEmpList(){
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Emp> empList = empService.getEmpList();
			mAndV.addObject("empList", empList);
			
			mAndV.setViewName("EmpList");
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	
	@RequestMapping("getDeptList.hr")
	public ModelAndView getDeptList(){
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Dept> deptList = empService.getDeptList();
			mAndV.addObject("deptList", deptList);
			
			mAndV.setViewName("DeptList");
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	/*@RequestMapping("getprdList.hr")
	public ModelAndView getprdList(){
		ModelAndView mAndV = new ModelAndView();
		try {
			ArrayList<Product> prdList = prdService.getProductList();
			mAndV.addObject("prdList", prdList);
			
			mAndV.setViewName("Productlist");
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}*/
	
	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(HttpServletRequest request, @RequestParam("id") int empId) {
//		String strEmpId = request.getParameter("id");
//		int empId = Integer.parseInt(strEmpId);
		
		ModelAndView mAndV = new ModelAndView();
		try {
			System.out.println(empId);
			Emp emp = empService.getEmpDetails(empId);
			mAndV.addObject("empDetails", emp);
			System.out.println(emp);
			mAndV.setViewName("EmpDetails");
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	
	@RequestMapping("deptDetails.hr")
	public ModelAndView getDeptDetails(HttpServletRequest request, @RequestParam("id") int deptId) {
//		String strEmpId = request.getParameter("id");
//		int empId = Integer.parseInt(strEmpId);
		
		ModelAndView mAndV = new ModelAndView();
		try {
			System.out.println(deptId);
			Dept dept = empService.getDeptDetails(deptId);
			mAndV.addObject("deptDetails", dept);
			System.out.println(dept);
			mAndV.setViewName("DeptDetails");
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	
/*	@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model) {
		// Define Command Object
		Employee emp = new Employee();
		model.addAttribute("command", emp);
		
		return "EntryPage";
	}
	
	@RequestMapping("submitRegistrationData.hr")
	public String submitRegistrationForm(@ModelAttribute("command") Employee emp, BindingResult result, Model model) {
		// Define Command Object
		System.out.println(emp);
		
		Set<ConstraintViolation<Employee>> violations = validator.validate(emp);
    	
    	for (ConstraintViolation<Employee> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }
    
    	if (result.hasErrors()) {
    		model.addAttribute("msg", "Errors in Entry.");
            return "EntryPage";
        } else {
        	try {
    			empService.addNewEmployee(emp);
    			return "SaveSuccess";
    		} catch (HrException e) {
    			model.addAttribute("msg", "Insert Failed!!!" + e.getMessage());
    			return "EntryPage";
    		}
        }
		
		
		
	}*/
}

package com.jp.hr.controllers;

import java.util.ArrayList;
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
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;


/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @RequestMapping: To map a controlling method to the url.
 * @RequestParam:  To take a single QueryString or FormData field value.
 * 
 * Multi-Action controllers.
 * */
// http://localhost:8081/Spring110_MVCbasics/homePage.do
@Controller
public class HomePageController {
	@ Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	private Validator validator;
	@InitBinder
    private void validateBinder() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);
        System.out.println("Validator is set."+validator.hashCode());*/
    }
	
	@RequestMapping("homePage.hr")
	public String getHomePage(){
		System.out.println("In getHomePage");
		return "HomePage";
	}
	@RequestMapping("getEmpList.hr")
	public ModelAndView getEmpList(){
		ModelAndView mAndV = new ModelAndView();
		try {
			ArrayList<Employee> empList = empService.getEmpList();
			mAndV.addObject("empList",empList);
			mAndV.setViewName("EmpList");
			
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mAndV;
		
	}
	
	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(HttpServletRequest request,@RequestParam("id") int empId){
/*		String strEmpId = request.getParameter("id");
		int empId = Integer.parseInt(strEmpId);*/
		ModelAndView mAndV = new ModelAndView();	
		
		try {
			Employee emp = empService.getEmpDetails(empId);
			mAndV.addObject("empDetails",emp);
			mAndV.setViewName("EmpDetails");
			
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mAndV;
		
	}
	
	@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model){
		// Define command object
		Employee emp = new Employee();
		model.addAttribute("command",emp);
		return "EntryPage";
		
	}
	
	@RequestMapping("submitRegistrationData.hr")
	public String submitRegistrationData(@ModelAttribute("command") Employee emp, BindingResult result, Model model){
		// Define command object
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
    		model.addAttribute("msg","Errors in entry.");
    		return "EntryPage";
        } else try{
    		empService.addNewEmployee(emp);
    		return "SaveSuccess";
    		}
    		catch (HrException e) {
    			model.addAttribute("msg","Insert failed" +e.getMessage());
    			e.printStackTrace();
    			return "EntryPage";
    		}
    	
		
		
	}
	
}

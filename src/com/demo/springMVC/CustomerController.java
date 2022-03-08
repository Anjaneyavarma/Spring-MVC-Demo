package com.demo.springMVC;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/setCustomer")
	public String setCustomer(Model theModel) {
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("processCustomer")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult bindingResult) {
		
		//log the input data
		System.out.println("Customer"+ theCustomer.getFirstName() + " " + theCustomer.getLastName());
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-conf";
		}
		
	}
}

package com.demo.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	//need a controller to show the intial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need controller to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "Hello";
	}
	
	@RequestMapping("/processForm2")
	public String DisplayMessage(HttpServletRequest request, Model model) {
		// read the data from the html form
		String theName = request.getParameter("studentName");
		// convert the data to uppercase
		theName = theName.toUpperCase();
		//create the message
		String msg = "Yo" + theName;
		//add message to the model
		model.addAttribute("message", msg);
		
		return "Hello";
	}
	
	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam("studentName") String name, Model model) {
		// convert the data to uppercase
		name = name.toUpperCase();
		//create the message
		String msg = "Hey my friend " + name;
		//add message to the model
		model.addAttribute("message", msg);
		
		return "Hello";
	}
}

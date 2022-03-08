package com.demo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class HelloController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "helloworld-form";
	}

}

package pl.pawelnielepkowicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
		
		// model is like a hashmap with name-value pairs, model sends and receives data 
		model.addAttribute("greeting", "Hello World");
		//hello.jsp
		return "hello";
	}
	
}

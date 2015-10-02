package pl.pawelnielepkowicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.pawelnielepkowicz.model.Exercise;

@Controller
public class MinutesController {
	
    @RequestMapping(value="/addMinutes")
    // <form:form commandName="exercise">
	public String addMinutes(@ModelAttribute ( "exercise" )  Exercise exercise ){ //public class Exercise
		
    	System.out.println("exercise.getMinutes(): " + exercise.getMinutes());
    	
    	//redirects to forward:addMoreMinutes.html, reloads application and goes to addMinutes
		//return "forward:addMoreMinutes.html";
    	
    	//redirects to forward:addMoreMinutes.html, reloads application, harder to submit form several timees
    	//return "redirect:addMoreMinutes.html";
    	
    	return "addMinutes";
	}
    
    
    
//    @RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ( "exercise" )  Exercise exercise ){ 
//    	System.out.println("exercising: " + exercise.getMinutes());
//    	//addMinutes.jsp
//		return "addMinutes";
//	}
    
    
	
}

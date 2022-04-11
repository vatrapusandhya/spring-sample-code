package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return"helloworld-form";
	}
	
	// need a controller method to show the processed  HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return"helloworld-processform";
	}
	
	//new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result= "Yo! "+name;
		model.addAttribute("message", result);
		
		return"helloworld-processform";
	} 
	
	@RequestMapping("/processFormVersionThree")
	public String processVersion(@RequestParam("studentName") String theName, Model model) {
		
		
		theName = theName.toUpperCase();
		String result= "Hey! "+theName;
		model.addAttribute("message", result);
		
		return"helloworld-processform";
	} 
	
	
	
	
	
	
}

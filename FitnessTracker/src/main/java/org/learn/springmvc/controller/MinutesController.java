package org.learn.springmvc.controller;

import org.learn.springmvc.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("exercise "+ exercise.getMinutes());
		return "forward:addMoreMinutes.html"; // forward will  pass the request to web application with Model data
		//return "addMinutes"; // redirect close that current request and create new request and pass that to controller.
	}
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("exercising "+ exercise.getMinutes());
		return "addMinutes";
	}

}

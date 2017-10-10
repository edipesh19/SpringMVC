package org.learn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/greeting")
	public String hello(Model model) {
		model.addAttribute("greeting", "Fitness Tracker is working");
		return "hello";
	}
}

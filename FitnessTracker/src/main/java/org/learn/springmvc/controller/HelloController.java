package org.learn.springmvc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class HelloController {

	private String nameStatic = null;

	@RequestMapping(value = "/greeting")
	public String hello(Model model) {
		model.addAttribute("greeting", "Fitness Tracker is working");
		if (null == nameStatic) {
			System.out.println("Name static initializing");
			nameStatic = "Dipesh";
		} else {
			System.out.println(nameStatic);

		}
		return "hello";
	}
}

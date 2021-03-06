package org.learn.springmvc.controller;

import org.learn.springmvc.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("goal")
public class GoalController {
	@RequestMapping(value="/addGoal", method=RequestMethod.GET)
	public String addGoal(Model model){
		Goal goalObj = new Goal();
		goalObj.setMinutes(10);
		model.addAttribute("goal", goalObj);
		return "addGoal";
	}
	
	@RequestMapping(value="/addGoal", method=RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Goal goal){
		System.out.println("Minutes updated: " + goal.getMinutes());
		
		return "redirect:addMinutes.html";
	}
	

}
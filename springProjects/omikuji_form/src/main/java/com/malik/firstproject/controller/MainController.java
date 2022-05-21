package com.malik.firstproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String processPayment(
	    @RequestParam(value="quantity") Integer quantity1,
	    @RequestParam(value="name") String name1, 
	    @RequestParam(value="person") String person1,
	    @RequestParam(value="hobby") String hobby1,
	    @RequestParam(value="living") String living1,
	    @RequestParam(value="nice") String nice1,HttpSession session) {
	    
		session.setAttribute("quantity",quantity1);
		session.setAttribute("name",name1);
		session.setAttribute("person",person1);
		session.setAttribute("hobby",hobby1);
		session.setAttribute("living",living1);
		session.setAttribute("nice",nice1);
	    
		return "redirect:/show"; 
	}
		
	@RequestMapping("/show")
	public String result (Model model,HttpSession session) {
		model.addAttribute("quantitykey", session.getAttribute("quantity"));
		model.addAttribute("namekey", session.getAttribute("name"));
		model.addAttribute("personkey", session.getAttribute("person"));
		model.addAttribute("hobbykey", session.getAttribute("hobby"));
		model.addAttribute("livingkey", session.getAttribute("living"));
		model.addAttribute("nicekey", session.getAttribute("nice"));
		return "indexshow.jsp";
	}
	
	
	
	
	
	
	
	
	
	
}

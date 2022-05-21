package com.malik.firstproject.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateTimeController {
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
	
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		return "indexdate.jsp";
	}
	
	
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		return "indextime.jsp";
	}
	
	
	
}
package com.malik.firstproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery,@RequestParam(value="lastnam" , required=false) String search1) {
		if(searchQuery == null) {
			return "Hello Human";
		}
		else {
			if(search1 != null)  {
				return ("Hello" + searchQuery + " " + search1);
			}
			else return "Hello " + searchQuery;
		}		
}
	
}

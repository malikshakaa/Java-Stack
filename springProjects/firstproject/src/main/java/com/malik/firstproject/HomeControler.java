package com.malik.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {
	@RequestMapping("/")
	 public String hello() { // 3
       return "Hello World!";
}
	
	@RequestMapping("/world")
	 public String world() {
        return "Class level annotations are cool too!";
}
}

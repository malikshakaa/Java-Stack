package com.malik.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.malik.mvc.models.Dojo;
import com.malik.mvc.services.DojoService;
import com.malik.mvc.services.NinjaService;

@Controller
public class DojoNinjaController {
	private  DojoService dojoService;
	
	public DojoNinjaController (DojoService ninjaDojoService) {
		this.dojoService = dojoService;
	}
	private  NinjaService ninjaService;
	
	public DojoNinjaController (NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}
    @GetMapping("/dojos")
    public String allDojos(Model model) {
    	List<Dojo> item = dojoService.allDojos();
    	model.addAttribute("dojos",item);
    	return"all-dojos.jsp";
    }
        
	
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojo.jsp";
    }
    @PostMapping("/dojos/new/adding")
    public String adddojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            dojoService.creatDojo(dojo);
            return "redirect:/dojos";
        }
    }
}